package test.frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TestMemo extends JFrame {

	// 필요한 필드 정의하기
	private JTextArea ta = new JTextArea();
	// 현재 열린 파일 객체를 저장할 필드
	private File openedFile;

	// 메뉴 아이템 참조
	private JMenuItem saveItem;
	private JMenuItem saveAsItem;

	// 생성자
	public TestMemo(String title) {
		super(title);
		// 메뉴바
		JMenuBar mb = new JMenuBar();
		// 메뉴
		JMenu menu = new JMenu("File");
		// 메뉴 아이템
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		saveItem = new JMenuItem("Save");
		saveAsItem = new JMenuItem("Save As");

		// 처음에는 Save, Save As 비활성화
		saveItem.setEnabled(false);
		saveAsItem.setEnabled(false);

		// 메뉴에 메뉴 아이템 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		mb.add(menu);
		setJMenuBar(mb);

		// 레이아웃 설정
		setLayout(new BorderLayout());
		JScrollPane scp = new JScrollPane(ta);
		add(scp, BorderLayout.CENTER);
		Font font = new Font("Serif", Font.PLAIN, 30);
		ta.setFont(font);
		ta.setVisible(false);

		// New 동작
		newItem.addActionListener(e -> {
			ta.setText("");
			ta.setVisible(true);
			setTitle("제목 없음");
			openedFile = null;
			saveItem.setEnabled(false);
			saveAsItem.setEnabled(true);
		});

		// Open 동작
		openItem.addActionListener(e -> {
			JFileChooser fc = new JFileChooser();
			// txt 파일만 보이도록 필터 설정
			fc.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
			int result = fc.showOpenDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
				openedFile = fc.getSelectedFile();
				setTitle(openedFile.getName());
				// 파일 읽기
				try (FileReader fr = new FileReader(openedFile); BufferedReader br = new BufferedReader(fr)) {
					StringBuilder sb = new StringBuilder();
					String line;
					while ((line = br.readLine()) != null) {
						sb.append(line).append(System.lineSeparator());
					}
					ta.setText(sb.toString());
					ta.setVisible(true);
					saveItem.setEnabled(true);
					saveAsItem.setEnabled(true);
				} catch (IOException ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(this, "파일 열기 실패: " + ex.getMessage());
				}
			}
		});

		// Save 동작
		saveItem.addActionListener(e -> {
			if (openedFile != null) {
				saveToFile();
			} else {
				JOptionPane.showMessageDialog(this, "저장할 파일이 없습니다.");
			}
		});

		// Save As 동작
		saveAsItem.addActionListener(e -> {
			JFileChooser fc = new JFileChooser();
			// txt 파일만 보이도록 필터 설정
			fc.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
			int result = fc.showSaveDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
				File selected = fc.getSelectedFile();
				// 확장자 자동 추가
				if (!selected.getName().toLowerCase().endsWith(".txt")) {
					selected = new File(selected.getParentFile(), selected.getName() + ".txt");
				}
				openedFile = selected;
				setTitle(openedFile.getName());
				try {
					openedFile.createNewFile();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				saveToFile();
			}
		});
	}

	// JTextArea 내용을 열린 파일에 저장
	public void saveToFile() {
		String memo = ta.getText();
		try (FileWriter fw = new FileWriter(openedFile)) {
			fw.write(memo);
			fw.flush();
			JOptionPane.showMessageDialog(this, "저장했습니다");
			saveItem.setEnabled(true);
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "저장 실패: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		MemoFrame f = new MemoFrame("메모장");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

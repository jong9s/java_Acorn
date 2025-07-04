package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame02 extends JFrame {
	// 필요한 필드 정의하기
	JTextField inputName, inputAddr;
	// 표 형식으로 정보를 출력할 UI
	JTable table;
	// JTable 에 출력할 data 를 공급해줄 모델 객체
	DefaultTableModel model;

	MemberDao dao = new MemberDao();

	// 생성자
	public MemberFrame02() {
		// 레이아웃 설정
		setLayout(new BorderLayout());

		// JLable 2개
		JLabel label1 = new JLabel("이름");
		JLabel label2 = new JLabel("주소");

		// JTextField 1개
		inputName = new JTextField(10);
		inputAddr = new JTextField(10);
		// JButton
		JButton insertBtn = new JButton("저장");
		JButton deleteBtn = new JButton("삭제");
		JButton updateBtn = new JButton("수정");

		insertBtn.addActionListener((e) -> {
			// 입력한 이름과, 주소를 읽어와서
			var name = inputName.getText();
			var addr = inputAddr.getText();
			// MemberDto 객체에 이름과 주소를 담는다.
			var dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			// MemberDao 객체를 이용해서 DB 에 저장하기
			Boolean isSuccess = dao.insert(dto);
			if (isSuccess) {
				// this 는 나의 참조값 (나 => MemberFrame 객체 => Component type 이기도 하다)
				JOptionPane.showMessageDialog(this, "추가했습니다");
			} else {
				JOptionPane.showMessageDialog(this, "추가 실패했습니다");
			}
		});
		// 삭제 버튼을 눌렀을 때 실행할 함수 등록
		deleteBtn.addActionListener((e) -> {
			// 선택된 row 의 index 값을 읽어온다
			int selectedRow = table.getSelectedRow();
			// 만약 선택된 row 가 없다면
			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row 를 선택해주세요!");
				return; // 메소드(함수) 를 여기서 끝내기(return 하기)
			} else {
				// 삭제할 회원의 Primary key 값(num) 을 읽어와서
				int num = (int) model.getValueAt(selectedRow, 0);
				// DB 에서 삭제한다
				dao.deleteByNum(num);
				// 기존에 출력된 내용을 모두 삭제하고

				// DB 에서 회원정보를 다시
				printMember();
			}
		});
		
		updateBtn.addActionListener((e)->{
			// 선택된 row 의 index 값을 읽어온다
			int selectedRow = table.getSelectedRow();
			// 만약 선택된 row 가 없다면
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "수정할 row 를 선택해주세요");
				return; // 메소드(함수)를 여기서 끝내기(return 하기)
			}
			// 선택된 row 에서 수정할 회원의 번호를 얻어낸다.
			int num = (int)model.getValueAt(selectedRow, 0);
			// 수정할 회원의 전체 정보를 DB 에서 읽어온다.
			MemberDto dto = dao.getByNum(num);
			// 수정 양식 UI 를 JPanel 로 구성한다.
			var inputName = new JTextField(10);
			var inputAddr = new JTextField(10);
			JPanel editPanel = new JPanel();
			editPanel.add(new JLabel("이름: "));
			editPanel.add(inputName);
			editPanel.add(new JLabel("주소: "));
			editPanel.add(inputAddr);
			// MemberDto 에 있는 정보를 JTextField 에 출력
			inputName.setText(dto.getName());
			inputAddr.setText(dto.getAddr());
			// JPanel 을 전달하면서 ConfirmDialog 를 띄운다
			int result = JOptionPane.showConfirmDialog(this, editPanel, num+ " 번 회원 수정", JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION) {
				// 입력한 이름과, 주소를 읽어와서
				String name = inputName.getText();
				String addr = inputAddr.getText();
				// 수정 반영한다
				MemberDto newDto = new MemberDto();
				newDto.setNum(num);
				newDto.setName(name);
				newDto.setAddr(addr);
				boolean isSuccess = dao.update(newDto);
				if(isSuccess) {
					JOptionPane.showMessageDialog(this, "수정 완료");
				} else {
					JOptionPane.showMessageDialog(this, "수정 실패");
				}
			}
			 printMember();
		});

		// 패널에 UI 배치
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		panel.add(deleteBtn);
		panel.add(updateBtn);
		// 패널의 배경색 설정
		panel.setBackground(Color.orange);
		// 패널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);

		// 회원목록을 출력할 테이블
		table = new JTable();
		// 테이블의 칼럼명을 배열로 미리 준비한다.
		String[] colNames = { "번호", "이름", "주소" };
		// 테이블에 연결할 모델 객체
		model = new DefaultTableModel();
		// 모델에 칼럼명을 전달한다.
		model.setColumnIdentifiers(colNames);
		// 모델을 테이블에 연결
		table.setModel(model);
		// 테이블의 글자 크기와 행의 높이 조절
		table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 18));
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16)); // 데이터 글자 크기 14
		table.setRowHeight(25); // 각 행의 높이를 조정
		// row 가 많은 경우 스크롤이 가능하도록 테이블에 scroll 기능을 부여한다.
		JScrollPane scroll = new JScrollPane(table);
		// 테이블을 품고 있는 JScrollPane 을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);

		// sample date 를 table 에 출력하기
//		Object[] row1 = {0, "sample name", "sample addr"};
//		model.addRow(row1);
		// MemberDao 객체를 이용해서 회원목록을 얻어온 다음 실제 회원 목록을 table 에 반복문 돌면서 출력해보세요.

		printMember(); // 같은 객체 안이기 때문에 this. 생략

	}

	public void printMember() {
		model.setRowCount(0); // model 에 있는 setrowCount 초기화
		List<MemberDto> list = dao.selectAll();

		for (MemberDto m : list) {
			Object[] row = { m.getNum(), m.getName(), m.getAddr() };
			// 모델에 추가하기
			model.addRow(row);
		}
	}

	public static void main(String[] args) {
		MemberFrame02 f = new MemberFrame02();
		f.setTitle("회원 정보 저장");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

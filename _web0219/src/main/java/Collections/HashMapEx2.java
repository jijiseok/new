package Collections;

import java.util.Map;
import java.util.Scanner;

import dao.MemberDao;
import dto.Member;

import java.util.HashMap;

public class HashMapEx2 {

	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		HashMap<String, Member> map = dao.selectMembers();

	
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호 입력");
			System.out.println("아이디 :");
			String id = scanner.nextLine();
			System.out.println("비밀번호 :");
			String email = scanner.nextLine();
			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).getEmail().equals(email)) {
					System.out.println("로그인");
					break;
				}else {
					System.out.println("비민번호 오류");
				}
			}else {
				System.out.println("입력한 아이디가 존재 하지않음");
			}

		}

	}
}
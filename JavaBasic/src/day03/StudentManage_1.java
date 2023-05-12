package day03;

import java.util.Scanner;

public class StudentManage_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//학생정보를 등록할 배열을 while문 바깥에 선언.
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		String[] genderList = new String[100];
		
		//고객수(사람수)
		int count = 0;
		//조회할 위치(Index)
		int index = -1;
		
		//
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		
		while(true) {
			
			System.out.println("[정보]고객수:" + count + ", 조회위치:" + index);
			System.out.println("[메뉴]1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료");
			System.out.println("===================================================================");
			System.out.println("메뉴입력>");
			String menu = scan.next();
			
			switch (menu) {
			case "추가":
			case "1":
				
				/*
				 * 이름, 성별, 간단한정보를 입력받아서 각각의 배열에 순서대로 저장될 수 있게 처리합니다.
				 * count를 증가합니다.
				 */
				
				System.out.println("==========고객정보입력==========");
				System.out.println("이름>");
				String name = scan.next();
				
				System.out.println("성별>");
				String gender = scan.next();
				
				System.out.println("나이>");
				int age = scan.nextInt();
				
				nameList[count] = name;
				genderList[count] = gender;
				ageList[count] = age;
				
				count ++;
				
				System.out.println("============================");
				break;
				
			case "2":
				/*
				 * 이전정보출력:
				 * 정보출력은 index위치로 출력합니다.
				 * 이전정보출력을 누르면 index를 -1시키고 해당위치에 정보를 출력.
				 * 조건
				 * index가 0보다 작다면, 출력하지 않도록 처리.
				 */
				System.out.println("==========이전 고객정보==========");
				if(index <= 0) {
					System.out.println("이전 고객정보가 없습니다.");
				} else {
					index--;
					System.out.printf("이름: %s, 성별: %s, 나이: %d\n", nameList[index], genderList[index], ageList[index]);
				}
				System.out.println("============================");
				break;
			
			case "3":
				
				/*
				 * 다음정보출력:
				 * 다음출력은 index위치로 출력합니다.
				 * 다음정보추력을 누르면 index를 +1시키고 해당위치에 정보를 출력.
				 * 조건
				 * count-1 보다 index가 같거나 크다면, 출력하지 않도록 처리.
				 */
				
				System.out.println("==========이전 고객정보==========");
				if(index >= count -1) {
					System.out.println("다음 고객정보가 없습니다.");
				} else {
					index++;
					System.out.printf("이름: %s, 성별: %s, 나이: %d\n", nameList[index], genderList[index], ageList[index]);
				}
				System.out.println("============================");
				
				break;

			case "4":
				
				/*
				 * 현재정보출력
				 * index가 가르키고 있는 위치정보를 출력.
				 * 
				 * 조건
				 * 출력할 수 있는 조건을 생각해서 처리.
				 */
				
				System.out.println("==========현재 고객정보==========");
				if(index <= count-1 && index >= 0) {
					System.out.printf("이름: %s, 성별: %s, 나이: %d\n", nameList[index], genderList[index], ageList[index]);
				} else {
					System.out.println("현재 고객정보가 없습니다.");
				}
				System.out.println("============================");
				break;
				
			case "5":
				/*
				 * 정보수정
				 * 새로운 이름, 나이, 정보를 입력받아서
				 * 현재 위치를 수정해주면 됩니다.
				 * 
				 * 조건
				 * 4번과 동일
				 */

				System.out.println("==========고객정보 수정==========");
				if(index >= 0 && index <= count -1) {
					System.out.println(nameList[index]+ "님의 정보를 수정합니다.");
				}
					System.out.println("새로운 이름 입력>" + nameList[index]);
					nameList[index]= scan.next();
					
					System.out.println("새로운 성별 입력>" + genderList[index]);
					genderList[index] = scan.next();
					
					System.out.println("새로운 나이 입력>" + ageList[index]);
					ageList[index] = scan.nextInt();
				System.out.println("==========수정 완료!==========");{
				}
				System.out.println("============================");
				break;
				
			case "6":
				/*
				 * 현재정보 삭제
				 * 현재삭제하려는 index부터 ~~~뒤에 있는 배열요소를 당겨와서 덮어 씌웁니다.
				 * 사람수를 감소 시킨다. (당겨오면 사람 수도 줄여야 배열이 꼬이지 않는다.)
				 * 
				 * 조건 
				 * 4번과 동일
				 */
				
				System.out.println("==========고객정보 삭제==========");
				if(index >= 0 && index <= count -1) {
					System.out.println(nameList[index]+ "님을 삭제합니다.");
				} for (int i = index; i < count-1; i++) {
					nameList[i] = nameList[i+1]; 
					genderList[i] = genderList[i+1]; 
					ageList[i] = ageList[i+1];
				} count--; 
				
				System.out.println("==============================");
				break;
				
			case "7":
				//while문의 탈출
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		}
	}
}
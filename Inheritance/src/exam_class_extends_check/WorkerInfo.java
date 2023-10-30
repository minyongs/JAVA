package exam_class_extends_check;

public class WorkerInfo {

	public static void main(String[] args) {
		//Info 클래스 값을 저장할거니까 Info 배열 생성
		Info[] worker = new Info[3];
		
		Info fo1 = new Info("A111",780000);//객체 생성
		Info fo2 = new Info("B222",450000);//객체 생성
		Info fo3 = new Info("C333",570000);//객체 생성
		//하나하나 저장해줌
		worker[0] = fo1;
		worker[1] = fo2;
		worker[2] = fo3;
		
		System.out.println("                      봉급계산서");
        System.out.println("====================================================");
        System.out.println("사번    기본급      수당       세금     본봉        등급");
        System.out.println("====================================================");
		
        for (int i = 0; i < worker.length; i++) {
            Info info = worker[i];
            info.getBong(); // 본봉 계산
            info.makeGrade(); // 등급 계산
            
            System.out.println(info.empno + "|" + info.gi + "|" + info.su + "|" + info.se + "|" + info.bong + "|" + info.grad);
        }
		
		
		
	}
	}
	
	



class Info{
	public int su;//수당
	public int gi;//기본급
	public int se;//세급
	public int bong;//본봉
	public String grad;//등급
	public String empno;// 사번

	public Info(String empno,int gi) {
		this.gi = gi;
		this.empno = empno;
		/*this.su = su;
		this.gi = gi;
		this.se = se;
		this.bong = bong;
		this.grad = grad;
		this.empno = empno;*/
	};
	

	
	public int  getBong() {
		su = (int) (gi *0.15);
		se = (int) (gi*0.2);
		bong = gi + su - se;
		
		return bong;
	}
	public void makeGrade() {
		if(bong<500000) {
			grad = "영업";
		}
		else {
			 grad = "관리자";
			}
		}
	}
	
	






package spring.aop.entity;

public class NewLecExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public NewLecExam() {
		// TODO Auto-generated constructor stub
	}
	
	public NewLecExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		
		int result = kor+eng+math+com;
		
		if(kor > 100)
			throw new IllegalArgumentException("유효하지않은 국어점수");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		float result = total() / 4.0f;
		return result;
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	
	
	
	

}

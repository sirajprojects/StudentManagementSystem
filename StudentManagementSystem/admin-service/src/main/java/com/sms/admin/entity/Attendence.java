package com.sms.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendence")

public class Attendence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "select_class")
	private String selectclass;

	@Column(name = "select_section")
	private String selectsection;

	@Column(name = "select_month")
	private String selectmonth;

	@Column(name = "student_name")
	private String studentname;

	@Column(name = "select_session")
	private String selectsession;

	@Column(name = "one")
	private boolean one;

	@Column(name = "two")
	private boolean two;

	@Column(name = "three")
	private boolean three;

	@Column(name = "four")
	private boolean four;

	@Column(name = "five")
	private boolean five;

	@Column(name = "six")
	private boolean six;

	@Column(name = "sevem")
	private boolean seven;

	@Column(name = "eight")
	private boolean eight;

	@Column(name = "nine")
	private boolean nine;

	@Column(name = "ten")
	private boolean ten;

	@Column(name = "eleven")
	private boolean eleven;

	@Column(name = "twelve")
	private boolean twelve;

	@Column(name = "thirteen")
	private boolean thirteen;

	@Column(name = "fourteen")
	private boolean fourteen;

	@Column(name = "fifteen")
	private boolean fifteen;

	@Column(name = "sixteen")
	private boolean sixteen;
	@Column(name = "seventeen")
	private boolean seventeen;

	@Column(name = "eighteen")
	private boolean eighteen;

	@Column(name = "nineteen")
	private boolean nineteen;

	@Column(name = "twenty")
	private boolean twenty;
	@Column(name = "twentyone")
	private boolean twentyone;

	@Column(name = "twentytwo")
	private boolean twentytwo;

	@Column(name = "twentythree")
	private boolean twentythree;

	@Column(name = "twentyfour")
	private boolean twentyfour;

	@Column(name = "twentyfive")
	private boolean twentyfive;

	@Column(name = "twentysix")
	private boolean twentysix;

	@Column(name = "twentyseven")
	private boolean twentyseven;

	@Column(name = "twentyeight")
	private boolean twentyeight;
	@Column(name = "twentynine")
	private boolean twentynine;

	@Column(name = "thirty")
	private boolean thirty;

	@Column(name = "thirtyone")
	private boolean thirtyone;
	

	public Attendence() {
		super();
	}

	public Attendence( String selectclass, String selectsection, String selectmonth, String studentname,
			String selectsession, boolean one, boolean two, boolean three, boolean four, boolean five, boolean six,
			boolean seven, boolean eight, boolean nine, boolean ten, boolean eleven, boolean twelve, boolean thirteen,
			boolean fourteen, boolean fifteen, boolean sixteen, boolean seventeen, boolean eighteen, boolean nineteen,
			boolean twenty, boolean twentyone, boolean twentytwo, boolean twentythree, boolean twentyfour,
			boolean twentyfive, boolean twentysix, boolean twentyseven, boolean twentyeight, boolean twentynine,
			boolean thirty, boolean thirtyone) {
	
		this.selectclass = selectclass;
		this.selectsection = selectsection;
		this.selectmonth = selectmonth;
		this.studentname = studentname;
		this.selectsession = selectsession;
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.five = five;
		this.six = six;
		this.seven = seven;
		this.eight = eight;
		this.nine = nine;
		this.ten = ten;
		this.eleven = eleven;
		this.twelve = twelve;
		this.thirteen = thirteen;
		this.fourteen = fourteen;
		this.fifteen = fifteen;
		this.sixteen = sixteen;
		this.seventeen = seventeen;
		this.eighteen = eighteen;
		this.nineteen = nineteen;
		this.twenty = twenty;
		this.twentyone = twentyone;
		this.twentytwo = twentytwo;
		this.twentythree = twentythree;
		this.twentyfour = twentyfour;
		this.twentyfive = twentyfive;
		this.twentysix = twentysix;
		this.twentyseven = twentyseven;
		this.twentyeight = twentyeight;
		this.twentynine = twentynine;
		this.thirty = thirty;
		this.thirtyone = thirtyone;
	}

	public long getId() {
		return id;
	}



	public String getSelectclass() {
		return selectclass;
	}

	public void setSelectclass(String selectclass) {
		this.selectclass = selectclass;
	}

	public String getSelectsection() {
		return selectsection;
	}

	public void setSelectsection(String selectsection) {
		this.selectsection = selectsection;
	}

	public String getSelectmonth() {
		return selectmonth;
	}

	public void setSelectmonth(String selectmonth) {
		this.selectmonth = selectmonth;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getSelectsession() {
		return selectsession;
	}

	public void setSelectsession(String selectsession) {
		this.selectsession = selectsession;
	}

	public boolean isOne() {
		return one;
	}

	public void setOne(boolean one) {
		this.one = one;
	}

	public boolean isTwo() {
		return two;
	}

	public void setTwo(boolean two) {
		this.two = two;
	}

	public boolean isThree() {
		return three;
	}

	public void setThree(boolean three) {
		this.three = three;
	}

	public boolean isFour() {
		return four;
	}

	public void setFour(boolean four) {
		this.four = four;
	}

	public boolean isFive() {
		return five;
	}

	public void setFive(boolean five) {
		this.five = five;
	}

	public boolean isSix() {
		return six;
	}

	public void setSix(boolean six) {
		this.six = six;
	}

	public boolean isSeven() {
		return seven;
	}

	public void setSeven(boolean seven) {
		this.seven = seven;
	}

	public boolean isEight() {
		return eight;
	}

	public void setEight(boolean eight) {
		this.eight = eight;
	}

	public boolean isNine() {
		return nine;
	}

	public void setNine(boolean nine) {
		this.nine = nine;
	}

	public boolean isTen() {
		return ten;
	}

	public void setTen(boolean ten) {
		this.ten = ten;
	}

	public boolean isEleven() {
		return eleven;
	}

	public void setEleven(boolean eleven) {
		this.eleven = eleven;
	}

	public boolean isTwelve() {
		return twelve;
	}

	public void setTwelve(boolean twelve) {
		this.twelve = twelve;
	}

	public boolean isThirteen() {
		return thirteen;
	}

	public void setThirteen(boolean thirteen) {
		this.thirteen = thirteen;
	}

	public boolean isFourteen() {
		return fourteen;
	}

	public void setFourteen(boolean fourteen) {
		this.fourteen = fourteen;
	}

	public boolean isFifteen() {
		return fifteen;
	}

	public void setFifteen(boolean fifteen) {
		this.fifteen = fifteen;
	}

	public boolean isSixteen() {
		return sixteen;
	}

	public void setSixteen(boolean sixteen) {
		this.sixteen = sixteen;
	}

	public boolean isSeventeen() {
		return seventeen;
	}

	public void setSeventeen(boolean seventeen) {
		this.seventeen = seventeen;
	}

	public boolean isEighteen() {
		return eighteen;
	}

	public void setEighteen(boolean eighteen) {
		this.eighteen = eighteen;
	}

	public boolean isNineteen() {
		return nineteen;
	}

	public void setNineteen(boolean nineteen) {
		this.nineteen = nineteen;
	}

	public boolean isTwenty() {
		return twenty;
	}

	public void setTwenty(boolean twenty) {
		this.twenty = twenty;
	}

	public boolean isTwentyone() {
		return twentyone;
	}

	public void setTwentyone(boolean twentyone) {
		this.twentyone = twentyone;
	}

	public boolean isTwentytwo() {
		return twentytwo;
	}

	public void setTwentytwo(boolean twentytwo) {
		this.twentytwo = twentytwo;
	}

	public boolean isTwentythree() {
		return twentythree;
	}

	public void setTwentythree(boolean twentythree) {
		this.twentythree = twentythree;
	}

	public boolean isTwentyfour() {
		return twentyfour;
	}

	public void setTwentyfour(boolean twentyfour) {
		this.twentyfour = twentyfour;
	}

	public boolean isTwentyfive() {
		return twentyfive;
	}

	public void setTwentyfive(boolean twentyfive) {
		this.twentyfive = twentyfive;
	}

	public boolean isTwentysix() {
		return twentysix;
	}

	public void setTwentysix(boolean twentysix) {
		this.twentysix = twentysix;
	}

	public boolean isTwentyseven() {
		return twentyseven;
	}

	public void setTwentyseven(boolean twentyseven) {
		this.twentyseven = twentyseven;
	}

	public boolean isTwentyeight() {
		return twentyeight;
	}

	public void setTwentyeight(boolean twentyeight) {
		this.twentyeight = twentyeight;
	}

	public boolean isTwentynine() {
		return twentynine;
	}

	public void setTwentynine(boolean twentynine) {
		this.twentynine = twentynine;
	}

	public boolean isThirty() {
		return thirty;
	}

	public void setThirty(boolean thirty) {
		this.thirty = thirty;
	}

	public boolean isThirtyone() {
		return thirtyone;
	}

	public void setThirtyone(boolean thirtyone) {
		this.thirtyone = thirtyone;
	}

	@Override
	public String toString() {
		return "Attendence [id=" + id + ", selectclass=" + selectclass + ", selectsection=" + selectsection
				+ ", selectmonth=" + selectmonth + ", studentname=" + studentname + ", selectsession=" + selectsession
				+ ", one=" + one + ", two=" + two + ", three=" + three + ", four=" + four + ", five=" + five + ", six="
				+ six + ", seven=" + seven + ", eight=" + eight + ", nine=" + nine + ", ten=" + ten + ", eleven="
				+ eleven + ", twelve=" + twelve + ", thirteen=" + thirteen + ", fourteen=" + fourteen + ", fifteen="
				+ fifteen + ", sixteen=" + sixteen + ", seventeen=" + seventeen + ", eighteen=" + eighteen
				+ ", nineteen=" + nineteen + ", twenty=" + twenty + ", twentyone=" + twentyone + ", twentytwo="
				+ twentytwo + ", twentythree=" + twentythree + ", twentyfour=" + twentyfour + ", twentyfive="
				+ twentyfive + ", twentysix=" + twentysix + ", twentyseven=" + twentyseven + ", twentyeight="
				+ twentyeight + ", twentynine=" + twentynine + ", thirty=" + thirty + ", thirtyone=" + thirtyone + "]";
	}



}

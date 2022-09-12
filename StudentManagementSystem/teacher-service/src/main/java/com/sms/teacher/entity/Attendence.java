package com.sms.teacher.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accountentity")

public class Attendence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

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


	public Attendence(boolean one, boolean two, boolean three, boolean four, boolean five, boolean six, boolean seven,
			boolean eight, boolean nine, boolean ten, boolean eleven, boolean twelve, boolean thirteen,
			boolean fourteen, boolean fifteen, boolean sixteen, boolean seventeen, boolean eighteen, boolean nineteen,
			boolean twenty, boolean twentyone, boolean twentytwo, boolean twentythree, boolean twentyfour,
			boolean twentyfive, boolean twentysix, boolean twentyseven, boolean twentyeight, boolean twentynine,
			boolean thirty, boolean thirtyone) {
		super();
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

	public boolean isOne() {
		return one;
	}

	public boolean isTwo() {
		return two;
	}

	public boolean isThree() {
		return three;
	}

	public boolean isFour() {
		return four;
	}

	public boolean isFive() {
		return five;
	}

	public boolean isSix() {
		return six;
	}

	public boolean isSeven() {
		return seven;
	}

	public boolean isEight() {
		return eight;
	}

	public boolean isNine() {
		return nine;
	}

	public boolean isTen() {
		return ten;
	}

	public boolean isEleven() {
		return eleven;
	}

	public boolean isTwelve() {
		return twelve;
	}

	public boolean isThirteen() {
		return thirteen;
	}

	public boolean isFourteen() {
		return fourteen;
	}

	public boolean isFifteen() {
		return fifteen;
	}

	public boolean isSixteen() {
		return sixteen;
	}

	public boolean isSeventeen() {
		return seventeen;
	}

	public boolean isEighteen() {
		return eighteen;
	}

	public boolean isNineteen() {
		return nineteen;
	}

	public boolean isTwenty() {
		return twenty;
	}

	public boolean isTwentyone() {
		return twentyone;
	}

	public boolean isTwentytwo() {
		return twentytwo;
	}

	public boolean isTwentythree() {
		return twentythree;
	}

	public boolean isTwentyfour() {
		return twentyfour;
	}

	public boolean isTwentyfive() {
		return twentyfive;
	}

	public boolean isTwentysix() {
		return twentysix;
	}

	public boolean isTwentyseven() {
		return twentyseven;
	}

	public boolean isTwentyeight() {
		return twentyeight;
	}

	public boolean isTwentynine() {
		return twentynine;
	}

	public boolean isThirty() {
		return thirty;
	}

	public boolean isThirtyone() {
		return thirtyone;
	}




	public void setOne(boolean one) {
		this.one = one;
	}

	public void setTwo(boolean two) {
		this.two = two;
	}

	public void setThree(boolean three) {
		this.three = three;
	}

	public void setFour(boolean four) {
		this.four = four;
	}

	public void setFive(boolean five) {
		this.five = five;
	}

	public void setSix(boolean six) {
		this.six = six;
	}

	public void setSeven(boolean seven) {
		this.seven = seven;
	}

	public void setEight(boolean eight) {
		this.eight = eight;
	}

	public void setNine(boolean nine) {
		this.nine = nine;
	}

	public void setTen(boolean ten) {
		this.ten = ten;
	}

	public void setEleven(boolean eleven) {
		this.eleven = eleven;
	}

	public void setTwelve(boolean twelve) {
		this.twelve = twelve;
	}

	public void setThirteen(boolean thirteen) {
		this.thirteen = thirteen;
	}

	public void setFourteen(boolean fourteen) {
		this.fourteen = fourteen;
	}

	public void setFifteen(boolean fifteen) {
		this.fifteen = fifteen;
	}

	public void setSixteen(boolean sixteen) {
		this.sixteen = sixteen;
	}

	public void setSeventeen(boolean seventeen) {
		this.seventeen = seventeen;
	}

	public void setEighteen(boolean eighteen) {
		this.eighteen = eighteen;
	}

	public void setNineteen(boolean nineteen) {
		this.nineteen = nineteen;
	}

	public void setTwenty(boolean twenty) {
		this.twenty = twenty;
	}

	public void setTwentyone(boolean twentyone) {
		this.twentyone = twentyone;
	}

	public void setTwentytwo(boolean twentytwo) {
		this.twentytwo = twentytwo;
	}

	public void setTwentythree(boolean twentythree) {
		this.twentythree = twentythree;
	}

	public void setTwentyfour(boolean twentyfour) {
		this.twentyfour = twentyfour;
	}

	public void setTwentyfive(boolean twentyfive) {
		this.twentyfive = twentyfive;
	}

	public void setTwentysix(boolean twentysix) {
		this.twentysix = twentysix;
	}

	public void setTwentyseven(boolean twentyseven) {
		this.twentyseven = twentyseven;
	}

	public void setTwentyeight(boolean twentyeight) {
		this.twentyeight = twentyeight;
	}

	public void setTwentynine(boolean twentynine) {
		this.twentynine = twentynine;
	}

	public void setThirty(boolean thirty) {
		this.thirty = thirty;
	}

	public void setThirtyone(boolean thirtyone) {
		this.thirtyone = thirtyone;
	}

	@Override
	public String toString() {
		return "Attendence [id=" + id + ", one=" + one + ", two=" + two + ", three=" + three + ", four=" + four
				+ ", five=" + five + ", six=" + six + ", seven=" + seven + ", eight=" + eight + ", nine=" + nine
				+ ", ten=" + ten + ", eleven=" + eleven + ", twelve=" + twelve + ", thirteen=" + thirteen
				+ ", fourteen=" + fourteen + ", fifteen=" + fifteen + ", sixteen=" + sixteen + ", seventeen="
				+ seventeen + ", eighteen=" + eighteen + ", nineteen=" + nineteen + ", twenty=" + twenty
				+ ", twentyone=" + twentyone + ", twentytwo=" + twentytwo + ", twentythree=" + twentythree
				+ ", twentyfour=" + twentyfour + ", twentyfive=" + twentyfive + ", twentysix=" + twentysix
				+ ", twentyseven=" + twentyseven + ", twentyeight=" + twentyeight + ", twentynine=" + twentynine
				+ ", thirty=" + thirty + ", thirtyone=" + thirtyone + "]";
	}

	

	
	
	
	
	
}

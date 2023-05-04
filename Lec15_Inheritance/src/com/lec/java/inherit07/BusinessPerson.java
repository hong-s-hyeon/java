package com.lec.java.inherit07;

public class BusinessPerson extends Person{

    // member variable
    private String company;


    //getter setter
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    // 메소드 오버라이딩(Overriding)
    @Override
    protected void showInfo() {
//    private void showInfo() {    // 권한 범위가 줄어드는 오버라이딩은 불가!
        super.showInfo();   // 부모의 showInfo() 수행
        System.out.println("회사 : " + company);
    }


    // 메소드 오버로딩 (overloading)
    public void showInfo(int id){
        System.out.println("id: " + id);
        System.out.println("이름: " + getName()); // name 안된다! private 이니까~
        System.out.println("회사: " + company);
    }


    // IntelliJ 에선
    // CTRL + O 를 누르면 Override 진행
    @Override
    public String toString() {
        return "BusinessPerson: " + getName() + " " + getCompany();
    }


}

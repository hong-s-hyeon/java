package practice.cardcompany;

public class Company {

    private static int num = 10000;
    private static Company instance = null;

    // TODO
    // 필요한 변수, 메소드, 생성자 정의하기
    private static String company;

    private Company() {
        company = "우리은행";
        System.out.println("하이 첫방문 방문해줘서 고마워");
    }

    public static Company getInstance() {
        if (instance == null) {
            Company com = new Company();
            instance = com;
        }
        System.out.println("안녕하세요, " + company + "에 방문에 주셔서 감사합니다");
        return instance;
    }

    public Card createCard() {
        num++;
        Card card = new Card(num);
        return card;
    }


} // end class

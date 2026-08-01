package month2.week1.analysis;

public class AnalysisPractice {
    public static void main(String[] args) {
        Analysis analysis1 = new Analysis("Mocotó", 8.5, 8.0, 400, 350);
        Analysis analysis2 = new Analysis("Dog Dog", 8.5, 8.5, 400, 400);
        Analysis analysis3 = new Analysis("Rocky Dog", 9.5, 10.0, 400, 500);

        analysis1.showData();
        analysis2.showData();
        analysis3.showData();

    }
}

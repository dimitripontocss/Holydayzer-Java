public class App {
    public static void main(String[] args) {
        Holyday anoNovo = new Holyday("Confraternização mundial", "01/01/2023");
        Holyday carnaval = new Holyday("Carnaval", "21/02/2023");
        Holyday pascoa = new Holyday("Páscoa", "17/04/2023");

        HolydayList holydayList = new HolydayList();

        holydayList.addHolyday(pascoa);
        holydayList.addHolyday(carnaval);
        holydayList.addHolyday(anoNovo);

        holydayList.getHolydays();

        holydayList.getHolydayByDate("01/01/2023");
        holydayList.getHolydayByDate("02/01/2023");
    }
}

// "01/01/2023" => "Confraternização mundial"
// "21/02/2023" => "Carnaval"
// "17/04/2023" => "Páscoa"
// "21/04/2023" => "Tiradentes"
// "01/05/2023" => "Dia do trabalho"
// "08/06/2023" => "Corpus Christi"
// "07/09/2023" => "Independência do Brasil"
// "12/10/2023" => "Nossa Senhora Aparecida"
// "02/11/2023" => "Finados"
// "15/11/2023" => "Proclamação da República"
// "25/12/2023" => "Natal"
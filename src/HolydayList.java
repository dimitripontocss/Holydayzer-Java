import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HolydayList {
    private List<Holyday> holydays;

    public HolydayList() {
        this.holydays = new ArrayList<>();
    }

    public void addHolyday(Holyday holyday) {
        this.holydays.add(holyday);
    }

    public void getHolydayByDate(String date) {
        for (int i = 0; i < this.holydays.size(); i++) {
            if (Objects.equals(date, this.holydays.get(i).getDate())) {
                this.holydays.get(i).getInfo();
                return;
            }
        }
        System.out.println("Não tem feriado nessa data :(");
    }

    public void getHolydays() {
        System.out.println("Esses são todos os feriados:");
        for (int i = 0; i < this.holydays.size(); i++) {
            this.holydays.get(i).getInfo();
        }
        System.out.println("---------------------------------------");
    }

}

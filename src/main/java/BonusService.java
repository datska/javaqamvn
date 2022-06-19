public class BonusService {
    public long calculate(long amout, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amout * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}

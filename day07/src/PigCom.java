import java.util.Comparator;


    public class PigCom implements Comparator<Pig>{
        @Override
        public int compare(Pig o1, Pig o2) {
            return o1.getId() - o2.getId();
        }
    }


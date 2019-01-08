package lecture.entryset;



import java.util.*;

public class ClassroomApplication {

    public static void main(String[] args) {

        Map<String, List<Participant>> classroom = getClassroom();
        List<Participant> participants = getParticipants();
        addParticipantsToTables(classroom, participants);

        Set<Map.Entry<String, List<Participant>>> tables = classroom.entrySet();

        for (Map.Entry<String, List<Participant>> table : tables) {
            String tableName = table.getKey();
            List<Participant> tableParticipants = table.getValue();
            int numberOfParticipants = tableParticipants.size();

            System.out.println(tableName + " has "+ numberOfParticipants + " participants");
            System.out.println(tableParticipants);
        }
//get one of the table randomly
        Random random = new Random();
        Set<String> tableNames = classroom.keySet();
        System.out.println("Table names: "+tableNames);
        ArrayList<String> bla = new ArrayList<>(tableNames);
        String name = bla.get(random.nextInt(bla.size()));
        System.out.println(name);

    }



    private static Map<String, List<Participant>> getClassroom() {
        Map<String, List<Participant>> classroom = new HashMap<>();
        String[] split = "table 1,table 2,table 3,table 4,table 5".split(",");
        List<String> tables = Arrays.asList(split);
        for (String table : tables) {
            classroom.put(table, new ArrayList<>());
        }
        return classroom;
    }
//read the list of participants from the file
    private static List<Participant> getParticipants() {
        FileReader reader = new FileReader();
        List<Participant> participants = new ArrayList<>();
        List<String> names = reader.getLines("lecture/entryset/names.csv");
        for (String name : names) {
            Participant participant = new Participant(name);
            participants.add(participant);
        }
        return participants;
    }
//put the first 5 participants to table1
    private static void addParticipantsToTables(Map<String, List<Participant>> classroom, List<Participant> participants) {
        for (int position= 0; position<5 ; position++) {
            Participant participant = participants.get(position);
            List<Participant> table = classroom.get("table 1");
            table.add(participant);
        }

        //System.out.println(classroom);

        for (int position =5; position<10 ; position++){
            Participant participant = participants.get(position);
            List<Participant> table = classroom.get("table 2");
            table.add(participant);
        }
       // System.out.println(classroom);
    }

}

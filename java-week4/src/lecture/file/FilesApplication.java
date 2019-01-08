package lecture.file;

import java.util.*;

public class FilesApplication {
    public static void main(String[] args) {

        FileReader reader = new FileReader();
        readDocument(reader);
        readName(reader);
        readParticipants(reader);

    }




    private static void readDocument(FileReader reader) {
        System.out.println("------Document");
        List<String> lines = reader.getLines("lecture/file/document.txt");
        for (String line : lines) {
            System.out.println(line);
        }
    }


        private static void readName(FileReader reader) {
            System.out.println("-----------Names");
            List<String> lines = reader.getLines("lecture/file/names.txt");
            for (String line : lines) {
                System.out.println(line.toUpperCase());
            }

        }

    private static void readParticipants(FileReader reader) {
        System.out.println("---------Participants");
        List<String> lines = reader.getLines("lecture/file/participants.csv");
        List<Participant> participants = toParticipants(lines);
        //it sort the name alphabetically
        Collections.sort(participants, Comparator.comparing(Participant::getName));
        for (Participant participant : participants) {
            System.out.println(participant);
        }

        
    }

    private static List<Participant> toParticipants(List<String> lines) {

        List<Participant> participants = new ArrayList<>();
        for (String line : lines) {
            Participant participant =toParticipant(line);
            participants.add(participant);


        }
        return participants;
    }
//translate one line to one participant
    private static Participant toParticipant(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String name = columns.get(0);
        String group = columns.get(1).trim();

        return new Participant(name,group);
    }

}

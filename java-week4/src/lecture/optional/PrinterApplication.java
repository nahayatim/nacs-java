package lecture.optional;

import java.util.Optional;

public class PrinterApplication {
    public static void main(String[] args) {

        Printer printer = new Printer(3);
        for (int times=0; times<8; times++){
            Optional<String> text = printer.print("some other text");
            if (text.isPresent()){
            System.out.println(text.get());
        }else {
                printer.addPages(3);
            }

    }
}
}

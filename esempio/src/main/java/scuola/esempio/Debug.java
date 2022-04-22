package scuola.esempio;

import scuola.esempio.model.repository.StudenteRepository;

public class Debug {
    public static void main(String[] args) {
        System.out.println(StudenteRepository.selezionaStudenti());
    }
}

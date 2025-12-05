public class TesteEmpregado {
    public static void main(String[] args) {
        Mensalista emp1 = new Mensalista("João da Silva", 0.0);
        System.out.println(emp1.dados());

        Mensalista emp2 = new Mensalista("José Pereira", 3500.00);
        System.out.println(emp2.dados());

        Comissionado emp3 = new Comissionado("Maria Pereira", 1500.00, 5000.00);
        System.out.println(emp3.dados());
    }
}

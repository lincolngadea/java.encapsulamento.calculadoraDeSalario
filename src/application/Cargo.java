package application;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());


    private RegraDeNegocio regra;

    Cargo(RegraDeNegocio regra){
        this.regra = regra;
    }

    public RegraDeNegocio getRegra(){
        return regra;
    }
}

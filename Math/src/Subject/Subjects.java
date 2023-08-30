package Subject;

public enum Subjects {
    CHI("Chinese"),
    ENG("English"),
    MATH("Maths"),
    LS("Liberal Studies"),
    PHY("Physics"),
    CHEM("Chemistry"),
    BIO("Biology"),
    GEOG("Geography"),
    CHIHIS("Chinese History"),
    HIS("History"),
    PED("Physical Education"),
    MUS("Music"),
    VA("Visual Art"),

;

    private String name;

    private Subjects(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public Subjects getSubjects(String name){
        this.name.equals(name);
        return this;
    }

    
}

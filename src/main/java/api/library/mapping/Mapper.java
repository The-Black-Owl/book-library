package api.library.mapping;

public interface Mapper <ClassA,ClassB>{
    ClassB mapTo(ClassA classA);
    ClassA mapFrom(ClassB classB);
}

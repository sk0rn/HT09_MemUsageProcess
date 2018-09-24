import java.util.Date;


public class SomeObject {

    private long id;
    private String name;
    private Date dateBirth;
    private String someValue;



    public SomeObject(long id, String name) {
        this.id = id;
        this.name = name;
        dateBirth = new Date();
        someValue = "In computer science, garbage collection (GC) is a form of automatic memory management. " +
                "The garbage collector, or just collector, attempts to reclaim garbage, or memory occupied " +
                "by objects that are no longer in use by the program. Garbage collection was invented " +
                "by John McCarthy around 1959 to simplify manual memory management in Lisp.[1][2]\n" +
                "\n" +
                "Garbage collection is essentially the opposite of manual memory management, which requires " +
                "the programmer to specify which objects to deallocate and return to the memory system. " +
                "However, many systems use a combination of approaches, including other techniques such as " +
                "stack allocation and region inference. Like other memory management techniques, garbage " +
                "collection may take a significant proportion of total processing time in a program and, " +
                "as a result, can have significant influence on performance. With good implementations and " +
                "with enough memory, depending on application, garbage collection can be faster than manual " +
                "memory management, while the opposite can also be true and has often been the case in the " +
                "past with sub-optimal GC algorithms.\n" +
                "\n" +
                "Resources other than memory, such as network sockets, database handles, user interaction " +
                "windows, and file and device descriptors, are not typically handled by garbage collection. " +
                "Methods used to manage such resources, particularly destructors, may suffice to manage " +
                "memory as well, leaving no need for GC. Some GC systems allow such other resources to be " +
                "associated with a region of memory that, when collected, causes the resource to be reclaimed; " +
                "this is called finalization. Finalization may introduce complications limiting its usability, " +
                "such as intolerable latency between disuse and reclaim of especially limited resources, " +
                "or a lack of control over which thread performs the work of reclaiming." +
                "\n" +
                "The basic principles of garbage collection are to find data objects in a program that cannot " +
                "be accessed in the future, and to reclaim the resources used by those objects.\n" +
                "\n" +
                "Many programming languages require garbage collection, either as part of the language " +
                "specification (for example, Java, C#, D,[3] Go and most scripting languages) or effectively " +
                "for practical implementation (for example, formal languages like lambda calculus); these are " +
                "said to be garbage collected languages. Other languages were designed for use with manual " +
                "memory management, but have garbage-collected implementations available (for example, C and C++). " +
                "Some languages, like Ada, Modula-3, and C++/CLI, allow both garbage collection and manual " +
                "memory management to co-exist in the same application by using separate heaps for collected " +
                "and manually managed objects; others, like D, are garbage-collected but allow the user to " +
                "manually delete objects and also entirely disable garbage collection when speed is required.\n" +
                "\n" +
                "While integrating garbage collection into the language's compiler and runtime system enables " +
                "a much wider choice of methods,[citation needed] post-hoc GC systems exist, such as Automatic " +
                "Reference Counting (ARC), including some that do not require recompilation. " +
                "(Post-hoc GC is sometimes distinguished as litter collection.) The garbage collector will " +
                "almost always be closely integrated with the memory allocator." +
                "\n" +
                "Typically, garbage collection has certain disadvantages, including consuming additional resources, " +
                "performance impacts, possible stalls in program execution, and incompatibility with manual " +
                "resource management." +
                "\n" +
                "Garbage collection consumes computing resources in deciding which memory to free, even though " +
                "the programmer may have already known this information. The penalty for the convenience of not " +
                "annotating object lifetime manually in the source code is overhead, which can lead to decreased " +
                "or uneven performance.[4] A peer-reviewed paper came to the conclusion that GC needs five times " +
                "the memory to compensate for this overhead and to perform as fast as explicit memory management.[5] " +
                "Interaction with memory hierarchy effects can make this overhead intolerable in circumstances " +
                "that are hard to predict or to detect in routine testing. The impact on performance was also " +
                "given by Apple as a reason for not adopting garbage collection in iOS despite being the most " +
                "desired feature.[6]\n" +
                "\n" +
                "The moment when the garbage is actually collected can be unpredictable, resulting in stalls " +
                "(pauses to shift/free memory) scattered throughout a session. Unpredictable stalls can be " +
                "unacceptable in real-time environments, in transaction processing, or in interactive programs. " +
                "Incremental, concurrent, and real-time garbage collectors address these problems, " +
                "with varying trade-offs.\n" +
                "\n" +
                "The modern GC implementations try to minimize blocking \"stop-the-world\" stalls by doing as " +
                "much work as possible on the background (i.e. on a separate thread), for example marking " +
                "unreachable garbage instances while the application process continues to run. In spite of " +
                "these advancements, for example in the .NET CLR paradigm it is still very difficult to " +
                "maintain large heaps (millions of objects) with resident objects that get promoted to older " +
                "generations without incurring noticeable delays (sometimes a few seconds).\n" +
                "\n" +
                "Non-deterministic GC is incompatible with resource acquisition is initialization (RAII) b" +
                "ased management of non-GCed resources[citation needed]. As a result, the need for explicit " +
                "manual resource management (release/close) for non-GCed resources becomes transitive to " +
                "composition. That is: in a non-deterministic GC system, if a resource or a resource-like " +
                "object requires manual resource management (release/close), and this object is used as \"part of\" " +
                "another object, then the composed object will also become a resource-like object that itself " +
                "requires manual resource management (release/close)." + id;
    }
}

/**
 * Write a description of class BookStore here.
 *
 * @author Adam Dipinto
 * @version V2 - July 21 2017
 */
import java.util.Arrays;
public class BookStore
{
    private String storeName;
    private Book[] inventory;
    private final int NO_VALUE = 0;
    private final int MAX_ARRAY = 100;
    private String TAYLOR = "Taylor's Used Books";
    private String JASON = "Jason's Used Books";

    /**
     * Constructor for objects of class BookStore
     */
    public BookStore()
    {
        inventory = new Book[100];

        inventory[0] = new Book(new Author(new Name( "James", "Joyce", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ULYSSES");
        inventory[1] = new Book(new Author(new Name( "F.", "Fitzgerald", "Scott"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE GREAT GATSBY");
        inventory[2] = new Book(new Author(new Name( "James", "Joyce", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A PORTRAIT OF THE ARTIST AS A YOUNG MAN");
        inventory[3] = new Book(new Author(new Name( "Vladimir", "Nabokov", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LOLITA");
        inventory[4] = new Book(new Author(new Name( "Aldous", "Huxley", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "BRAVE NEW WORLD");
        inventory[5] = new Book(new Author(new Name( "William", "Faulkner", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE SOUND AND THE FURY");
        inventory[6] = new Book(new Author(new Name( "Joseph", "Heller", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "CATCH-22");
        inventory[7] = new Book(new Author(new Name( "Arthur", "Koestler", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "DARKNESS AT NOON");
        inventory[8] = new Book(new Author(new Name( "D.", "Lawrence", "H."), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SONS AND LOVERS");
        inventory[9] = new Book(new Author(new Name( "John", "Steinbeck", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"THE GRAPES OF WRATH" );
        inventory[10] = new Book(new Author(new Name( "Malcolm", "Lowry", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"UNDER THE VOLCANO");
        inventory[11] = new Book(new Author(new Name( "Samuel", "Butler", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE WAY OF ALL FLESH");
        inventory[12] = new Book(new Author(new Name( "George", "Orwell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "1984");
        inventory[13] = new Book(new Author(new Name( "Robert", "Graves", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "I, CLAUDIUS");
        inventory[14] = new Book(new Author(new Name( "Virginia", "Woolf", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"TO THE LIGHTHOUSE");
        inventory[15] = new Book(new Author(new Name( "Theodore", "Dreiser", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "AN AMERICAN TRAGEDY");
        inventory[16] = new Book(new Author(new Name( "Carson", "McCullers", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"THE HEART IS A LONELY HUNTER");
        inventory[17] = new Book(new Author(new Name( "Kurt", "Vonnegut", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SLAUGHTERHOUSE-FIVE");
        inventory[18] = new Book(new Author(new Name( "Ralph", "Ellison", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"INVISIBLE MAN");
        inventory[19] = new Book(new Author(new Name( "Richard", "Wright", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "NATIVE SON");
        inventory[20] = new Book(new Author(new Name( "Saul", "Bellow", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "HENDERSON THE RAIN KING");
        inventory[21] = new Book(new Author(new Name( "John", "O'Hara", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "APPOINTMENT IN SAMARRA");
        inventory[22] = new Book(new Author(new Name( "John", "Passos", "Dos"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "U.S.A.(trilogy)");
        inventory[23] = new Book(new Author(new Name( "Sherwood", "Anderson", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "WINESBURG, OHIO");
        inventory[24] = new Book(new Author(new Name( "E.M.", "Forster", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A PASSAGE TO INDIA");
        inventory[25] = new Book(new Author(new Name( "Henry", "James", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE WINGS OF THE DOVE");
        inventory[26] = new Book(new Author(new Name( "Henry", "James", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE AMBASSADORS");
        inventory[27] = new Book(new Author(new Name( "F.", "Fitzgerald", "Scott"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "TENDER IS THE NIGHT");
        inventory[28] = new Book(new Author(new Name( "James", "Farrell", "T."), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE STUDS LONIGAN TRILOGY");
        inventory[29] = new Book(new Author(new Name( "Ford", "Ford", "Madox") , new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE GOOD SOLDIER");
        inventory[30] = new Book(new Author(new Name( "George", "Orwell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ANIMAL FARM");
        inventory[31] = new Book(new Author(new Name( "Henry", "James", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE GOLDEN BOWL");
        inventory[32] = new Book(new Author(new Name( "Theodore", "Dreiser", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SISTER CARRIE");
        inventory[33] = new Book(new Author(new Name( "Evelyn", "Waugh", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A HANDFUL OF DUST");
        inventory[34] = new Book(new Author(new Name( "William", "Faulkner", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "AS I LAY DYING");
        inventory[35] = new Book(new Author(new Name( "Robert", "Warren", "Penn"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ALL THE KING'S MEN");
        inventory[36] = new Book(new Author(new Name( "Thornton", "Wilder", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE BRIDGE OF SAN LUIS REY");
        inventory[37] = new Book(new Author(new Name( "E.M.", "Forster", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "HOWARDS END");
        inventory[38] = new Book(new Author(new Name( "James", "Baldwin", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "GO TELL IT ON THE MOUNTAIN");
        inventory[39] = new Book(new Author(new Name( "Graham", "Greene", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE HEART OF THE MATTER");
        inventory[40] = new Book(new Author(new Name( "William", "Golding", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LORD OF THE FLIES");
        inventory[41] = new Book(new Author(new Name( "James", "Dickey", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "DELIVERANCE");
        inventory[42] = new Book(new Author(new Name( "Anthony", "Powell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A DANCE TO THE MUSIC OF TIME (series)");
        inventory[43] = new Book(new Author(new Name( "Aldous", "Huxley", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "POINT COUNTER POINT");
        inventory[44] = new Book(new Author(new Name( "Ernest", "Hemingway", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE SUN ALSO RISES");
        inventory[45] = new Book(new Author(new Name( "Joseph", "Conrad", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE SECRET AGENT");
        inventory[46] = new Book(new Author(new Name( "Joseph", "Conrad", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "NOSTROMO");
        inventory[47] = new Book(new Author(new Name( "D.H.","Lawrence", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE RAINBOW");
        inventory[48] = new Book(new Author(new Name( "D.H.","Lawrence", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "WOMEN IN LOVE");
        inventory[49] = new Book(new Author(new Name( "Henry", "Miller", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "TROPIC OF CANCER");
        inventory[50] = new Book(new Author(new Name( "Norman", "Mailer", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE NAKED AND THE DEAD");
        inventory[51] = new Book(new Author(new Name( "Philip", "Roth", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "PORTNOY'S COMPLAINT");
        inventory[52] = new Book(new Author(new Name( "Vladimir", "Nabokov", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "PALE FIRE");
        inventory[53] = new Book(new Author(new Name( "William", "Faulkner", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LIGHT IN AUGUST");
        inventory[54] = new Book(new Author(new Name( "Jack", "Kerouac", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ON THE ROAD");
        inventory[55] = new Book(new Author(new Name( "Dashiell", "Hammett", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE MALTESE FALCON");
        inventory[56] = new Book(new Author(new Name( "Ford", "Ford"," Madox"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "PARADE'S END");
        inventory[57] = new Book(new Author(new Name( "Edith", "Wharton", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE AGE OF INNOCENCE");
        inventory[58] = new Book(new Author(new Name( "Max", "Beerbohm", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ZULEIKA DOBSON");
        inventory[59] = new Book(new Author(new Name( "Walker", "Percy", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE MOVIEGOER");
        inventory[60] = new Book(new Author(new Name( "Willa", "Cather", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "DEATH COMES FOR THE ARCHBISHOP");
        inventory[61] = new Book(new Author(new Name( "James", "Jones", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "FROM HERE TO ETERNITY");
        inventory[62] = new Book(new Author(new Name( "John", "Cheever", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE WAPSHOT CHRONICLES");
        inventory[63] = new Book(new Author(new Name( "J.D.", "Salinger", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE CATCHER IN THE RYE");
        inventory[64] = new Book(new Author(new Name( "Anthony", "Burgess",null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A CLOCKWORK ORANGE");
        inventory[65] = new Book(new Author(new Name( "W.", "Maugham", "Somerset"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "OF HUMAN BONDAGE");
        inventory[66] = new Book(new Author(new Name( "Joseph", "Conrad", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "HEART OF DARKNESS");
        inventory[67] = new Book(new Author(new Name( "Sinclair", "Lewis", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "MAIN STREET");
        inventory[68] = new Book(new Author(new Name( "Edith", "Wharton", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE HOUSE OF MIRTH");
        inventory[69] = new Book(new Author(new Name( "Lawrence", "Durell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE ALEXANDRIA QUARTET");
        inventory[70] = new Book(new Author(new Name( "Richard", "Hughes", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A HIGH WIND IN JAMAICA");
        inventory[71] = new Book(new Author(new Name( "V.S.", "Naipaul", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A HOUSE FOR MR BISWAS");
        inventory[72] = new Book(new Author(new Name( "Nathanael", "West", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE DAY OF THE LOCUST");
        inventory[73] = new Book(new Author(new Name( "Ernest", "Hemingway", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A FAREWELL TO ARMS");
        inventory[74] = new Book(new Author(new Name( "Evelyn", "Waugh", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SCOOP");
        inventory[75] = new Book(new Author(new Name( "Muriel", "Spark", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE PRIME OF MISS JEAN BRODIE");
        inventory[76] = new Book(new Author(new Name( "James", "Joyce", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "FINNEGANS WAKE");
        inventory[77] = new Book(new Author(new Name( "Rudyard", "Kipling", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "KIM");
        inventory[78] = new Book(new Author(new Name( "E.M.", "Forster", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A ROOM WITH A VIEW");
        inventory[79] = new Book(new Author(new Name( "Evelyn", "Waugh", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "BRIDESHEAD REVISITED");
        inventory[80] = new Book(new Author(new Name( "Saul", "Bellow", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE ADVENTURES OF AUGIE MARCH");
        inventory[81] = new Book(new Author(new Name( "Wallace", "Stegner", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ANGLE OF REPOSE");
        inventory[82] = new Book(new Author(new Name( "V.S.", "Naipaul", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A BEND IN THE RIVER");
        inventory[83] = new Book(new Author(new Name( "Elizabeth", "Bowen", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE DEATH OF THE HEART");
        inventory[84] = new Book(new Author(new Name( "Joseph", "Conrad", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LORD JIM");
        inventory[85] = new Book(new Author(new Name( "E.L.", "Doctorow", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "RAGTIME");
        inventory[86] = new Book(new Author(new Name( "Arnold", "Bennett", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE OLD WIVES' TALE");
        inventory[87] = new Book(new Author(new Name( "Jack", "London", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE CALL OF THE WILD");
        inventory[88] = new Book(new Author(new Name( "Henry", "Green", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LOVING");
        inventory[89] = new Book(new Author(new Name( "Salman", "Rushdie", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "MIDNIGHT'S CHILDREN");
        inventory[90] = new Book(new Author(new Name( "Erskine", "Caldwell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "TOBACCO ROAD");
        inventory[91] = new Book(new Author(new Name( "William", "Kennedy", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "IRONWEED");
        inventory[92] = new Book(new Author(new Name( "John", "Fowles", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE MAGUS");
        inventory[93] = new Book(new Author(new Name( "Jean", "Rhys", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "WIDE SARGASSO SEA");
        inventory[94] = new Book(new Author(new Name( "Iris", "Murdoch", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "UNDER THE NET");
        inventory[95] = new Book(new Author(new Name( "William", "Styron", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SOPHIE'S CHOICE");
        inventory[96] = new Book(new Author(new Name( "Paul", "Bowles", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE SHELTERING SKY");
        inventory[97] = new Book(new Author(new Name( "James", "Cain", " M."), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE POSTMAN ALWAYS RINGS TWICE");
        inventory[98] = new Book(new Author(new Name( "J.P.", "Donleavy", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE GINGER MAN");
        inventory[99] = new Book(new Author(new Name( "Booth", "Tarkington", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE MAGNIFICENT AMBERSONS");
    }
    
    /**
     * [BookStore description]
     * @param storeName     name of store
     */
    public BookStore(String storeName)
    {
        inventory = new Book[100];
        
        inventory[0] = new Book(new Author(new Name( "James", "Joyce", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ULYSSES");
        inventory[1] = new Book(new Author(new Name( "F.", "Fitzgerald", "Scott"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE GREAT GATSBY");
        inventory[2] = new Book(new Author(new Name( "James", "Joyce", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A PORTRAIT OF THE ARTIST AS A YOUNG MAN");
        inventory[3] = new Book(new Author(new Name( "Vladimir", "Nabokov", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LOLITA");
        inventory[4] = new Book(new Author(new Name( "Aldous", "Huxley", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "BRAVE NEW WORLD");
        inventory[5] = new Book(new Author(new Name( "William", "Faulkner", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE SOUND AND THE FURY");
        inventory[6] = new Book(new Author(new Name( "Joseph", "Heller", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "CATCH-22");
        inventory[7] = new Book(new Author(new Name( "Arthur", "Koestler", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "DARKNESS AT NOON");
        inventory[8] = new Book(new Author(new Name( "D.", "Lawrence", "H."), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SONS AND LOVERS");
        inventory[9] = new Book(new Author(new Name( "John", "Steinbeck", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"THE GRAPES OF WRATH" );
        inventory[10] = new Book(new Author(new Name( "Malcolm", "Lowry", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"UNDER THE VOLCANO");
        inventory[11] = new Book(new Author(new Name( "Samuel", "Butler", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE WAY OF ALL FLESH");
        inventory[12] = new Book(new Author(new Name( "George", "Orwell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "1984");
        inventory[13] = new Book(new Author(new Name( "Robert", "Graves", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "I, CLAUDIUS");
        inventory[14] = new Book(new Author(new Name( "Virginia", "Woolf", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"TO THE LIGHTHOUSE");
        inventory[15] = new Book(new Author(new Name( "Theodore", "Dreiser", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "AN AMERICAN TRAGEDY");
        inventory[16] = new Book(new Author(new Name( "Carson", "McCullers", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"THE HEART IS A LONELY HUNTER");
        inventory[17] = new Book(new Author(new Name( "Kurt", "Vonnegut", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SLAUGHTERHOUSE-FIVE");
        inventory[18] = new Book(new Author(new Name( "Ralph", "Ellison", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01),"INVISIBLE MAN");
        inventory[19] = new Book(new Author(new Name( "Richard", "Wright", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "NATIVE SON");
        inventory[20] = new Book(new Author(new Name( "Saul", "Bellow", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "HENDERSON THE RAIN KING");
        inventory[21] = new Book(new Author(new Name( "John", "O'Hara", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "APPOINTMENT IN SAMARRA");
        inventory[22] = new Book(new Author(new Name( "John", "Passos", "Dos"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "U.S.A.(trilogy)");
        inventory[23] = new Book(new Author(new Name( "Sherwood", "Anderson", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "WINESBURG, OHIO");
        inventory[24] = new Book(new Author(new Name( "E.M.", "Forster", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A PASSAGE TO INDIA");
        inventory[25] = new Book(new Author(new Name( "Henry", "James", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE WINGS OF THE DOVE");
        inventory[26] = new Book(new Author(new Name( "Henry", "James", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE AMBASSADORS");
        inventory[27] = new Book(new Author(new Name( "F.", "Fitzgerald", "Scott"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "TENDER IS THE NIGHT");
        inventory[28] = new Book(new Author(new Name( "James", "Farrell", "T."), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE STUDS LONIGAN TRILOGY");
        inventory[29] = new Book(new Author(new Name( "Ford", "Ford", "Madox") , new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE GOOD SOLDIER");
        inventory[30] = new Book(new Author(new Name( "George", "Orwell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ANIMAL FARM");
        inventory[31] = new Book(new Author(new Name( "Henry", "James", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE GOLDEN BOWL");
        inventory[32] = new Book(new Author(new Name( "Theodore", "Dreiser", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SISTER CARRIE");
        inventory[33] = new Book(new Author(new Name( "Evelyn", "Waugh", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A HANDFUL OF DUST");
        inventory[34] = new Book(new Author(new Name( "William", "Faulkner", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "AS I LAY DYING");
        inventory[35] = new Book(new Author(new Name( "Robert", "Warren", "Penn"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ALL THE KING'S MEN");
        inventory[36] = new Book(new Author(new Name( "Thornton", "Wilder", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE BRIDGE OF SAN LUIS REY");
        inventory[37] = new Book(new Author(new Name( "E.M.", "Forster", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "HOWARDS END");
        inventory[38] = new Book(new Author(new Name( "James", "Baldwin", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "GO TELL IT ON THE MOUNTAIN");
        inventory[39] = new Book(new Author(new Name( "Graham", "Greene", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE HEART OF THE MATTER");
        inventory[40] = new Book(new Author(new Name( "William", "Golding", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LORD OF THE FLIES");
        inventory[41] = new Book(new Author(new Name( "James", "Dickey", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "DELIVERANCE");
        inventory[42] = new Book(new Author(new Name( "Anthony", "Powell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A DANCE TO THE MUSIC OF TIME (series)");
        inventory[43] = new Book(new Author(new Name( "Aldous", "Huxley", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "POINT COUNTER POINT");
        inventory[44] = new Book(new Author(new Name( "Ernest", "Hemingway", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE SUN ALSO RISES");
        inventory[45] = new Book(new Author(new Name( "Joseph", "Conrad", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE SECRET AGENT");
        inventory[46] = new Book(new Author(new Name( "Joseph", "Conrad", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "NOSTROMO");
        inventory[47] = new Book(new Author(new Name( "D.H.","Lawrence", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE RAINBOW");
        inventory[48] = new Book(new Author(new Name( "D.H.","Lawrence", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "WOMEN IN LOVE");
        inventory[49] = new Book(new Author(new Name( "Henry", "Miller", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "TROPIC OF CANCER");
        inventory[50] = new Book(new Author(new Name( "Norman", "Mailer", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE NAKED AND THE DEAD");
        inventory[51] = new Book(new Author(new Name( "Philip", "Roth", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "PORTNOY'S COMPLAINT");
        inventory[52] = new Book(new Author(new Name( "Vladimir", "Nabokov", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "PALE FIRE");
        inventory[53] = new Book(new Author(new Name( "William", "Faulkner", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LIGHT IN AUGUST");
        inventory[54] = new Book(new Author(new Name( "Jack", "Kerouac", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ON THE ROAD");
        inventory[55] = new Book(new Author(new Name( "Dashiell", "Hammett", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE MALTESE FALCON");
        inventory[56] = new Book(new Author(new Name( "Ford", "Ford"," Madox"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "PARADE'S END");
        inventory[57] = new Book(new Author(new Name( "Edith", "Wharton", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE AGE OF INNOCENCE");
        inventory[58] = new Book(new Author(new Name( "Max", "Beerbohm", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ZULEIKA DOBSON");
        inventory[59] = new Book(new Author(new Name( "Walker", "Percy", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE MOVIEGOER");
        inventory[60] = new Book(new Author(new Name( "Willa", "Cather", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "DEATH COMES FOR THE ARCHBISHOP");
        inventory[61] = new Book(new Author(new Name( "James", "Jones", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "FROM HERE TO ETERNITY");
        inventory[62] = new Book(new Author(new Name( "John", "Cheever", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE WAPSHOT CHRONICLES");
        inventory[63] = new Book(new Author(new Name( "J.D.", "Salinger", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE CATCHER IN THE RYE");
        inventory[64] = new Book(new Author(new Name( "Anthony", "Burgess",null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A CLOCKWORK ORANGE");
        inventory[65] = new Book(new Author(new Name( "W.", "Maugham", "Somerset"), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "OF HUMAN BONDAGE");
        inventory[66] = new Book(new Author(new Name( "Joseph", "Conrad", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "HEART OF DARKNESS");
        inventory[67] = new Book(new Author(new Name( "Sinclair", "Lewis", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "MAIN STREET");
        inventory[68] = new Book(new Author(new Name( "Edith", "Wharton", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE HOUSE OF MIRTH");
        inventory[69] = new Book(new Author(new Name( "Lawrence", "Durell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE ALEXANDRIA QUARTET");
        inventory[70] = new Book(new Author(new Name( "Richard", "Hughes", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A HIGH WIND IN JAMAICA");
        inventory[71] = new Book(new Author(new Name( "V.S.", "Naipaul", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A HOUSE FOR MR BISWAS");
        inventory[72] = new Book(new Author(new Name( "Nathanael", "West", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE DAY OF THE LOCUST");
        inventory[73] = new Book(new Author(new Name( "Ernest", "Hemingway", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A FAREWELL TO ARMS");
        inventory[74] = new Book(new Author(new Name( "Evelyn", "Waugh", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SCOOP");
        inventory[75] = new Book(new Author(new Name( "Muriel", "Spark", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE PRIME OF MISS JEAN BRODIE");
        inventory[76] = new Book(new Author(new Name( "James", "Joyce", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "FINNEGANS WAKE");
        inventory[77] = new Book(new Author(new Name( "Rudyard", "Kipling", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "KIM");
        inventory[78] = new Book(new Author(new Name( "E.M.", "Forster", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A ROOM WITH A VIEW");
        inventory[79] = new Book(new Author(new Name( "Evelyn", "Waugh", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "BRIDESHEAD REVISITED");
        inventory[80] = new Book(new Author(new Name( "Saul", "Bellow", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE ADVENTURES OF AUGIE MARCH");
        inventory[81] = new Book(new Author(new Name( "Wallace", "Stegner", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "ANGLE OF REPOSE");
        inventory[82] = new Book(new Author(new Name( "V.S.", "Naipaul", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "A BEND IN THE RIVER");
        inventory[83] = new Book(new Author(new Name( "Elizabeth", "Bowen", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE DEATH OF THE HEART");
        inventory[84] = new Book(new Author(new Name( "Joseph", "Conrad", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LORD JIM");
        inventory[85] = new Book(new Author(new Name( "E.L.", "Doctorow", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "RAGTIME");
        inventory[86] = new Book(new Author(new Name( "Arnold", "Bennett", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE OLD WIVES' TALE");
        inventory[87] = new Book(new Author(new Name( "Jack", "London", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE CALL OF THE WILD");
        inventory[88] = new Book(new Author(new Name( "Henry", "Green", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "LOVING");
        inventory[89] = new Book(new Author(new Name( "Salman", "Rushdie", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "MIDNIGHT'S CHILDREN");
        inventory[90] = new Book(new Author(new Name( "Erskine", "Caldwell", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "TOBACCO ROAD");
        inventory[91] = new Book(new Author(new Name( "William", "Kennedy", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "IRONWEED");
        inventory[92] = new Book(new Author(new Name( "John", "Fowles", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE MAGUS");
        inventory[93] = new Book(new Author(new Name( "Jean", "Rhys", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "WIDE SARGASSO SEA");
        inventory[94] = new Book(new Author(new Name( "Iris", "Murdoch", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "UNDER THE NET");
        inventory[95] = new Book(new Author(new Name( "William", "Styron", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "SOPHIE'S CHOICE");
        inventory[96] = new Book(new Author(new Name( "Paul", "Bowles", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE SHELTERING SKY");
        inventory[97] = new Book(new Author(new Name( "James", "Cain", " M."), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE POSTMAN ALWAYS RINGS TWICE");
        inventory[98] = new Book(new Author(new Name( "J.P.", "Donleavy", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE GINGER MAN");
        inventory[99] = new Book(new Author(new Name( "Booth", "Tarkington", null), new Date(2017,01,01), new Date(2017,01,01), new Name(null,null,null)), new Date(2017,01,01), "THE MAGNIFICENT AMBERSONS");
        
        if (storeName != null) {
            if (storeName.equals(TAYLOR)) {
                storeName = JASON;
            } else {
                storeName = storeName;
            }
        }
        
    }
    /**
     * [howManyBooksDidThisAuthorWrite description]
     * @param authorLastName last name of author
     * @return        number of books from author
     */
    public int howManyBooksDidThisAuthorWrite(String authorLastName) {
        int counter = NO_VALUE; 
        if (authorLastName != null) {
            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i] != null) {
                    System.out.println(inventory[i].getAuthor().getName().getLastName());
                    if (inventory[i].getAuthor().getName().getLastName().equalsIgnoreCase(authorLastName)) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
    /**
     * [getAuthorFullName description]
     * @param title         title of book
     * @return        name of the author from title provided
     */
    public String getAuthorFullName(String title) {
        String fullName = "";
        
        if (title != null) {
            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i] != null) {
                    System.out.println(inventory[i].getTitle());
                    if (inventory[i].getTitle().equalsIgnoreCase(title)) {
                        fullName = inventory[i].getAuthor().getName().getFullName();
                    }
                }
            }
        }
        
        return fullName;
    }
    /**
     * [getBooksWrittenBy description]
     * @param  authorLastName  select author by lastname  for books written
     * @return        all books written by author
     */
    public Book[] getBooksWrittenBy(String authorLastName) {
        Book [] booksWritten = new Book[MAX_ARRAY];
        int counter = NO_VALUE;
        
        if (authorLastName != null) {
            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i] != null) {
                    if (inventory[i].getAuthor().getName().getLastName().equalsIgnoreCase(authorLastName)) {
                        booksWritten[counter] = inventory[i];
                        counter++;
                    }
                }
            }
        }
        Book booksWrittenClean[] = Arrays.copyOf(booksWritten, counter);
        
        return booksWrittenClean;
    }
    
   /**
    * [getBookWrittenBy description]
    * @param firstName     first name of the author
    * @return        all books written by author
    */
    public Book getBookWrittenBy(String firstName) {
        Book booksWritten = new Book(); 
        String inventoryAuthor = "";
        int j = 0;
        
        if (firstName != null) {
            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i] != null) {
                    if (inventory[i].getAuthor().getName().getFirstName().equalsIgnoreCase(firstName)) {
                        booksWritten = inventory[i];
                    }
                }    
            }
        }
        return booksWritten;
    }
    /**
     * [getBookTitlesContaining description]
     * @param wordInTitle   word that may be found in title
     * @return        an Array of all titles found with word in it
     */
    public String[] getBookTitlesContaining(String wordInTitle) {
        String [] titlesFound = new String[MAX_ARRAY];
        int counter = NO_VALUE;
        
        if (wordInTitle != null) {
            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i] != null) {
                    if (inventory[i].getTitle().contains(wordInTitle.toUpperCase())) {
                        titlesFound[counter] = inventory[i].getTitle();
                        counter++;
                    }
                }
            }
        }
        String titlesFoundClean[] = Arrays.copyOf(titlesFound, counter);
        
        return titlesFoundClean;
    }
    
}

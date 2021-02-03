/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package story_game_2020;

/**
 * Words
 * @author catofschroedinger
 */

public class words {
    
    // Arrays
    static String[] words = {
              "Abacus", "Abortion", "Abstract", "Abundant", "Academia"
            , "Acronym", "Acrylic", "Adequate", "Alchemy", "Algebra"
            , "Alloy", "Amaranth", "Amnesia", "Ancestry", "Aquarium"
            , "Arcane", "Arson", "Atomic", "Aviation", "Axolotl"
            , "Babysitter", "Bachelor", "Backwards", "Bagpipes", "Baklava"
            , "Balancing", "Balloon", "Balsamic", "Bandits", "Bankrupt"
            , "Barbecue", "Basil", "Basketball", "Beckon", "Bees"
            , "Bittersweet", "Bleeding", "Brain", "Brackets", "Breeze"
            , "Cadaver", "Carnival", "Cashew", "Catnip", "Cement"
            , "Chairs", "Chills", "Civics", "Closure", "Coda"
            , "Cold", "Comb", "Commercial", "Copper", "Crazy"
            , "Cremate", "Crouton", "Cursed", "Cut", "Cyanide"
            , "Dagger", "Darkness", "Defenestration", "Demonic", "Depict"
            , "Desert", "Dessert", "Devil", "Doctor", "Dollop"
            , "Dough", "Draft", "Drainage", "Dread", "Driving"
            , "Drunk", "Duality", "Dusty", "Dyes", "Dystopia"
            , "Eagle", "Echidna", "Edge", "Effect", "Egotist"
            , "Eidetic", "Eject", "Embark", "Emerald", "Enact"
            , "Episodic", "Ergo", "Error", "Ethos", "Euphoria"
            , "Europe", "Eve", "Exhale", "Exorcist", "Empire"
            , "Fabric", "Factorial", "Faith", "Fatal", "Fate"
            , "Fatigue", "Fetus", "Fez", "Fig", "Figment"
            , "Firefly", "Focal", "Foreground", "Foreward", "Foster"
            , "Fractal", "Fright", "Frontier", "Funeral", "Fungi"
            , "Galaxy", "Gangly", "Gatekeep", "Gawk", "Gelatin"
            , "Genus", "Geography", "German", "Ghastly", "Goose"
            , "Gothic", "Graduate", "Granite", "Gravitation", "Gray"
            , "Grenade", "Guarding", "Gunshot", "Gymnastics", "Gyro"
            , "Hades", "Haggle", "Haiku", "Haphazard", "Helix"
            , "Herbal", "Hexagon", "Hills", "Hoax", "Holier"
            , "Homeric", "Hook", "Horoscope", "Horror", "Hound"
            , "Humanois", "Hurl", "Hydro", "Hymn", "Hyphen"
            , "Icecaps", "Idiotic", "Idol", "Idyll", "Ignore"
            , "Illusion", "Imbecilic", "Improv", "Index", "Injury"
            , "Ink", "Inquiry", "Insider", "Instant", "Iris"
            , "Irony", "Issues", "Iodine" , "Ion","Ivory"
            , "Jackal", "Jam", "Jailer", "January", "Japan"
            , "Jargon", "Jasper", "Jealous", "Jetlagged","Jetpack"
            , "Jewel", "Jigsaw", "Jingle", "Joins", "Journal"
            , "Journey", "Joust", "Judge", "Juice", "Junior"
            , "Kangaroo", "Karat", "Kayak", "Kazoo", "Kebab"
            , "Kelp", "Kennel", "Ketone", "Khaki", "Kidney"
            , "Kimono", "King", "Kiosk", "Kit", "Kiwi"
            , "Knead", "Knife", "Knot", "Koala","Kung-fu"};
    
    static String[] s_rules = {};
    
    // Random element from an array
    public static String r_element(String[] a) {
        // Return a random element form the array, based on length of array
        return a[(int) Math.floor(Math.random() * (a.length - 1))];
    }
    
    // Generation
    static String generate (int n) {
        // Words
        switch (n) {
            case 0:
                return r_element(words);
            case 1:
                // No [insert letter here]
                return "No " + (char) (int) Math.floor(Math.random() * 26 + 65);
            default:
                return null;
        }
    }
}

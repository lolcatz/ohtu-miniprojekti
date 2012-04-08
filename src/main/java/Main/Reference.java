/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
/**
 *
 * @author psaikko
 */
public class Reference {
    public static final List<String> validTypes = Arrays.asList("article","book","booklet","conference","inbook",
    "incollection","inproceedings","manual","mastersthesis","misc","phdthesis",
    "proceedings","techreport","unpublished");
    
    public static final List<String> validFields = Arrays.asList("address","annote","author","booktitle","chapter","crossref",
    "edition", "editor", "howpublished", "institution", "journal", "key", "month","note",
    "number", "organization", "pages", "publisher", "school", "series", "title", "type",
    "volume", "year", "affiliation","abstract", "contents", "copyright", "ISBN", "ISSN", "keywords",
    "language", "location", "LCCN", "mrnumber", "URL");
     
    public String name;
    public String type;
    public HashMap<String,String> fields;

    public Reference(String name, String type, HashMap<String,String> fields) {
        this.name = name;
        this.type = type;
        this.fields = fields;
    }
}

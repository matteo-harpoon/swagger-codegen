package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;
import com.wordnik.common.StringValue;
import com.wordnik.common.Size;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class WordDefinitionsInput extends WordnikObject {

		 //Word to return definitions for
		 private String word ;  
			 //Maximum number of results to return
		 private String limit ;  
			 //CSV list of part-of-speech types
		 private String partOfSpeech ;  
			 //Return related words with definitions
		 private String includeRelated ;  
			 //Gets from dictionaries in the supplied order of precedence
		 private String sourceDictionaries ;  
			 //If true will try to return the correct word root ('cats' -> 'cat'). If false returns exactly what was requested.
		 private String useCanonical ;  
			 //Return a closed set of XML tags in response
		 private String includeTags ;  
		
	
		 //Word to return definitions for
		 
		 public String getWord() {
		 	return word;
		 }  
		 
		 public void setWord(String  word) {
		 	this.word = word;
		 }
			 //Maximum number of results to return
		 
		 public String getLimit() {
		 	return limit;
		 }  
		 
		 public void setLimit(String  limit) {
		 	this.limit = limit;
		 }
			 //CSV list of part-of-speech types
		 @AllowableValues(value="noun,adjective,verb,adverb,interjection,pronoun,preposition,abbreviation,affix,article,auxiliary-verb,conjunction,definite-article,family-name,given-name,idiom,imperative,noun-plural,noun-posessive,past-participle,phrasal-prefix,proper-noun,proper-noun-plural,proper-noun-posessive,suffix,verb-intransitive,verb-transitive")	 
		 public String getPartOfSpeech() {
		 	return partOfSpeech;
		 }  
		 
		 public void setPartOfSpeech(String  partOfSpeech) {
		 	this.partOfSpeech = partOfSpeech;
		 }
			 //Return related words with definitions
		 @AllowableValues(value="true,false")	 
		 public String getIncludeRelated() {
		 	return includeRelated;
		 }  
		 
		 public void setIncludeRelated(String  includeRelated) {
		 	this.includeRelated = includeRelated;
		 }
			 //Gets from dictionaries in the supplied order of precedence
		 @AllowableValues(value="ahd, century, wiktionary, webster, wordnet")	 
		 public String getSourceDictionaries() {
		 	return sourceDictionaries;
		 }  
		 
		 public void setSourceDictionaries(String  sourceDictionaries) {
		 	this.sourceDictionaries = sourceDictionaries;
		 }
			 //If true will try to return the correct word root ('cats' -> 'cat'). If false returns exactly what was requested.
		 @AllowableValues(value="false,true")	 
		 public String getUseCanonical() {
		 	return useCanonical;
		 }  
		 
		 public void setUseCanonical(String  useCanonical) {
		 	this.useCanonical = useCanonical;
		 }
			 //Return a closed set of XML tags in response
		 @AllowableValues(value="false,true")	 
		 public String getIncludeTags() {
		 	return includeTags;
		 }  
		 
		 public void setIncludeTags(String  includeTags) {
		 	this.includeTags = includeTags;
		 }
		
}
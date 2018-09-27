package bioc.esViews.BioCPassage;

import lombok.Data;

/**
 * The connection to the original text can be made through the {@code offset}, {@code length}, and possibly the {@code text} fields.
*/
@Data
public class BioCPassage__BioCLocation {
	/**
	 * Type of annotation. Options include "token", "noun phrase", "gene", and "disease". The valid values should be described in the {@code key} file.
	*/
	private int offset;

	/**
	 * The length of the annotated text. While unlikely, this could be zero to describe an annotation that belongs between two characters.
	*/
	private int length;


	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public BioCPassage__BioCLocation() {}
	public BioCPassage__BioCLocation(int offset, int length) {
		this.offset = offset;
		this.length = length;
	}


}

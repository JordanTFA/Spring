package c06.dependency_injection.setter;

public class TextEditor {
	
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}

}

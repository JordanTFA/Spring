package dependency_injection.setter;

public class TextEditor {
	
	private SpellChecker spellChecker;

	public SpellChecker getSpellchecker() {
		return spellChecker;
	}

	public void setSpellchecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}

}

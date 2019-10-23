package guestbook;

import javax.validation.constraints.NotBlank;

public class EditForm {

    private final @NotBlank String editedText;

    public EditForm(String editedText) {
        this.editedText = editedText;
    }

    public String getEditedText() {
        return editedText;
    }
}

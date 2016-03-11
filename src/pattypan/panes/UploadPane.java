/*
 * The MIT License
 *
 * Copyright 2016 Pawel Marynowski.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package pattypan.panes;

import javafx.event.ActionEvent;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import pattypan.elements.WikiButton;
import pattypan.elements.WikiLabel;
import pattypan.elements.WikiPane;

public class UploadPane extends WikiPane {

  Stage stage;

  WikiLabel descLabel;
  WikiButton uploadButton = new WikiButton("Upload", "primary").setWidth(300);
  WikiButton stopButton = new WikiButton("Stop");

  public UploadPane(Stage stage) {
    super(stage, 1.0);
    this.stage = stage;

    setContent();
  }

  public WikiPane getContent() {
    return this;
  }

  private WikiPane setContent() {
    descLabel = new WikiLabel("Click below to start upload.").setWrapped(true);
    descLabel.setTextAlignment(TextAlignment.LEFT);
    addElement(descLabel);

    uploadButton.setOnAction((ActionEvent e) -> {
      //upload();
    });

    addElement(uploadButton);

    prevButton.linkTo("LoginPane", stage);
    nextButton.setVisible(false);

    return this;
  }

}
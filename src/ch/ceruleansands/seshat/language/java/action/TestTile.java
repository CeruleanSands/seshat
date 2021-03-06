package ch.ceruleansands.seshat.language.java.action;

import ch.ceruleansands.seshat.gui.ErgonomicMenuItem;
import ch.ceruleansands.seshat.language.java.JavaDiagram;
import ch.ceruleansands.seshat.language.java.TileBuilder;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;

/**
 * @author Thomsch
 */
public class TestTile extends ErgonomicMenuItem {

    private final JavaDiagram javaDiagram;
    private final TileBuilder tileBuilder;

    @Inject
    public TestTile(@Assisted JavaDiagram javaDiagram, TileBuilder tileBuilder) {
        this.javaDiagram = javaDiagram;
        this.tileBuilder = tileBuilder;
    }

    @Override
    public String getTitle() {
        return "_Test tile";
    }

    @Override
    public KeyCombination getAccelerator() {
        return new KeyCodeCombination(KeyCode.T, KeyCombination.CONTROL_DOWN);
    }

    @Override
    public EventHandler<ActionEvent> getAction() {
        return event ->  {
            ch.ceruleansands.seshat.language.java.TestTile tile = tileBuilder.makeEmptyTile();
//            javaDiagram.addTile(tile);
        };
    }
}

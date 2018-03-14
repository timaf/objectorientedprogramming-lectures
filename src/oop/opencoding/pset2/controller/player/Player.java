package oop.opencoding.pset2.controller.player;

import oop.opencoding.pset2.model.move.Move;

public interface Player {

    Move getMove();

    boolean wantsToPlayAgain();

}

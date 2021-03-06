import java.util.Scanner;

/**
 * A model for the game of 20 questions
 * 
 * @author Rick Mercer
 * And @Auther Aaron Bell
 */
public class GameTree {

  /**
   * BinaryTreeNode inner class used to create new nodes in the GameTree.
   */
  private class BinaryTreeNode {
    private String data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    BinaryTreeNode(String theData) {
      data = theData;
      left = null;
      right = null;
    }

    BinaryTreeNode(String theData, BinaryTreeNode leftLink,
        BinaryTreeNode rightLink) {
      data = theData;
      left = leftLink;
      right = rightLink;
    }
  }

  /**
   * instance variables.
   */
  private BinaryTreeNode root;
  private Scanner my_inputFile;
  private String fileName;
  private BinaryTreeNode currentNodeReferenceInTree;

  /**
   * Constructor needed to create the game.
   * 
   * @param name
   *          this is the name of the file we need to import the game questions
   *          and answers from.
   */
  public GameTree(String name) {
    // TODO: Complete this method
  }

  /*
   * Add a new question and answer to the currentNode. If the current node has
   * the answer chicken, theGame.add("Does it swim?", "goose"); should change
   * that node like this:
   */
  // -----------Feathers?-----------------Feathers?------
  // -------------/----\------------------/-------\------
  // ------- chicken  horse-----Does it swim?-----horse--
  // -----------------------------/------\---------------
  // --------------------------goose--chicken-----------
  /**
   * @param newQuestion
   *          The question to add where the old answer was.
   * @param newAnswer
   *          The new Yes answer for the new question.
   */
  public void add(String newQuestion, String newAnswer) {
    // TODO: Complete this method
  }

  /**
   * True if getCurrent() returns an answer rather than a question.
   * 
   * @return False if the current node is an internal node rather than an answer
   *         at a leaf.
   */
  public boolean foundAnswer() {
    // TODO: Complete this method
    return false;
  }

  /**
   * Return the data for the current node, which could be a question or an
   * answer.
   * 
   * @return The current question or answer.
   */
  public String getCurrent() {
    // TODO: Complete this method
    return "under construction";
  }

  /**
   * Ask the game to update the current node by going left for Choice.yes or
   * right for Choice.no Example code: theGame.playerSelected(Choice.Yes);
   * 
   * @param yesOrNo
   */
  public void playerSelected(Choice yesOrNo) {
    // TODO: Complete this method
  }

  /**
   * Begin a game at the root of the tree. getCurrent should return the question
   * at the root of this GameTree.
   */
  public void reStart() {
    // TODO: Complete this method
  }

  /**
   * Overwrite the old file for this gameTree with the current state that may
   * have new questions added since the game started.
   * 
   */
  public void saveGame() {
    // TODO: Complete this method
  }

  @Override
  public String toString() {
    // TODO: Complete this method
    return "toString under construction";
  }
}
/**
 * 
 */
package Lab2;

import MazebotSim.MazebotSimulation;
import MazebotSim.Visualization.GuiMazeVisualization;

/**
 * @author Makav
 *
 */
public class SimulatedMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazebotSimulation sim = new MazebotSimulation("Mazes/TestArea.png", 1.5,  1.5);
		GuiMazeVisualization gui = new GuiMazeVisualization(1.5, sim.getStateAccessor());
		sim.scaleSpeed(1);
		sim.setRobotPosition(0.75, 0.75, 90);

		sim.startSimulation();
		gui.startVisualization();	

		//Call to the old main method here
		Part_2_2.main(new String[0]);
				
		sim.stopSimulation();


	}

}

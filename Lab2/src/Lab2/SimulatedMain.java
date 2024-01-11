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
		//MazebotSimulation sim = new MazebotSimulation("Mazes/TestArea.png", 1.5,  1.5); //For Part 1 to Part 2
		MazebotSimulation sim = new MazebotSimulation("Mazes/3x4_1.png", 1.4,  1.05); // for Part 3
		GuiMazeVisualization gui = new GuiMazeVisualization(1.5, sim.getStateAccessor());
		sim.scaleSpeed(1);
		//sim.setRobotPosition(0.75, 0.75, 90); //For part 1 to part 2
		sim.setRobotPosition(0.50, 0.55, 270); //For Part 3

		sim.startSimulation();
		gui.startVisualization();	

		//Call to the old main method here
		//Part_2_1_HelloWorld.main(new String[0]);
		//Part_2_2.main(new String[0]);
		//Part_2_2_Version2.main(new String[0]);
		//Part_2_3.main(new String[0]);
		//Part_3_1.main(new String[0]);
		//Part_3_2.main(new String[0]);
		//Move_test.main(new String[0]);
		//Part_3_3.main(new String[0]);
		//Part_3_3_version2.main(new String[0]);
		Part_3_4.main(new String[0]);
				
		
		sim.stopSimulation();


	}

}

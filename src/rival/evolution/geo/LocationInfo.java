package rival.evolution.geo;

import java.io.PrintStream;

import org.w3c.dom.Node;

import beast.core.Description;
import beast.core.StateNode;

@Description("Store location information, include latitude, longitude, altitude, temperature ...etc")
public class LocationInfo extends StateNode{

	@Override
	public void init(PrintStream out) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(int sample, PrintStream out) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(PrintStream out) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDimension() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArrayValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArrayValue(int dim) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void initAndValidate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEverythingDirty(boolean isDirty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StateNode copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assignTo(StateNode other) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignFrom(StateNode other) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignFromFragile(StateNode other) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fromXML(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int scale(double scale) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void store() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restore() {
		// TODO Auto-generated method stub
		
	}


}

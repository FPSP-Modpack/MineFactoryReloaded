package powercrystals.minefactoryreloaded.circuits.logic;

import powercrystals.minefactoryreloaded.circuits.base.StatelessCircuit;

public class Xor4 extends StatelessCircuit
{
	@Override
	public int getInputCount()
	{
		return 4;
	}
	
	@Override
	public int getOutputCount()
	{
		return 1;
	}
	
	@Override
	public int[] recalculateOutputValues(long worldTime, int[] inputValues)
	{
		if(inputValues[0] > 0 ^ inputValues[1] > 0 ^ inputValues[2] > 0 ^ inputValues[3] > 0)
		{
			return new int[] { 15 };
		}
		return new int[] { 0 };
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return "circuit.mfr.xor.4";
	}
	
	@Override
	public String getInputPinLabel(int pin)
	{
		return "I" + pin;
	}
	
	@Override
	public String getOutputPinLabel(int pin)
	{
		return "O";
	}
}

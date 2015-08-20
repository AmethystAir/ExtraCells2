package extracells.api.definitions;

import appeng.api.util.AEItemDefinition;

public interface IItemDefinition {

    // Fluid Storage Components
    AEItemDefinition cell1kPartFluid();

    AEItemDefinition cell4kPartFluid();

    AEItemDefinition cell16kPartFluid();

    AEItemDefinition cell64kPartFluid();

    AEItemDefinition cell256kPartFluid();

    AEItemDefinition cell1024kPartFluid();

    AEItemDefinition cell4096kPartFluid();

    // Physical Storage Components
    AEItemDefinition cell256kPart();

    AEItemDefinition cell1024kPart();

    AEItemDefinition cell4096kPart();

    AEItemDefinition cell16384kPart();

    // Fluid Storage Casing
    AEItemDefinition fluidCasing();

    // Fluid Cells
    AEItemDefinition fluidCell1k();

    AEItemDefinition fluidCell4k();

    AEItemDefinition fluidCell16k();

    AEItemDefinition fluidCell64k();

    AEItemDefinition fluidCell256k();

    AEItemDefinition fluidCell1024k();

    AEItemDefinition fluidCell4096k();

    AEItemDefinition fluidCellPortable();

    // Physical Storage Casing
    AEItemDefinition physCasing();

    // Physical Cells
    AEItemDefinition physCell256k();

    AEItemDefinition physCell1024k();

    AEItemDefinition physCell4096k();

    AEItemDefinition physCell16384k();

    AEItemDefinition physCellContainer();

    // MISC
    AEItemDefinition wirelessFluidTerminal();
}

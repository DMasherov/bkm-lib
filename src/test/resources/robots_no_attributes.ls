// TODO: merge LS and LSS grammars: add concept declarations and using attributes.

// declarations
// Robot.
// (Agent linked_to Agent).

// logic specification
Robot ISA Agent AND NOT (ControlAgent1 OR ControlAgent2) .
ControlAgent1 OR ControlAgent2 ISA Agent .
EXIST RobotA .
EXIST RobotB .
EXIST RobotC .
EXIST RobotD .
EXIST ControlAgent1 .
EXIST ControlAgent2 .
EACH RobotA NOT linked_to EACH RobotB AND ControlAgent2.
EACH RobotC NOT linked_to EACH RobotD AND ControlAgent1.
EACH RobotD linked_to SOME ControlAgent1.
EACH Agent linked_to EACH ControlAgent1 OR Agent THAT linked_to SOME ControlAgent1.

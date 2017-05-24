// declarations
Robot[Type: String].
(Agent linked_to Agent).

// logic
Robot ISA Agent AND NOT (ControlAgent1 OR ControlAgent2) .
ControlAgent1 OR ControlAgent2 ISA Agent .
EXIST Robot(Type='a') .
EXIST Robot(Type='b') .
EXIST Robot(Type='c') .
EXIST Robot(Type='d') .
EXIST ControlAgent1 .
EXIST ControlAgent2 .
EACH Robot(Type='a') NOT linked_to EACH Robot(Type='b') AND ControlAgent2.
EACH Robot(Type='c') NOT linked_to EACH Robot(Type='d') AND ControlAgent1.
EACH Robot(Type='d') linked_to SOME ControlAgent1.
EACH Agent linked_to EACH ControlAgent1 OR Agent THAT linked_to SOME ControlAgent1.

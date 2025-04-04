class Badge {
    public String print(Integer id, String name, String department) {
        if (id == null && department == null)
            return String.format("%s - %s", name, "OWNER");
        if (department == null)
            return String.format("[%d] - %s - %s", id, name, "OWNER");
        if (id == null)
            return String.format("%s - %s", name, department.toUpperCase());
        return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
    }
}

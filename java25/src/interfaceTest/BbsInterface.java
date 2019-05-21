package interfaceTest;

public interface BbsInterface {

	void insert(BbsDTO dto);
	void update(BbsDTO dto);
	void delete(String id);
	BbsDTO select(String id);
}

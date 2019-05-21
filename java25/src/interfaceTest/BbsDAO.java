package interfaceTest;

public class BbsDAO implements BbsInterface {

	@Override
	public void insert(BbsDTO dto) {
		System.out.println("게시물 작성");
	}

	@Override
	public void update(BbsDTO dto) {
		System.out.println("게시물 수정");
	}

	@Override
	public void delete(String id) {
		System.out.println("게시물 삭제");
	}

	@Override
	public BbsDTO select(String id) {
		BbsDTO dto = new BbsDTO("kim","kimmm","hahahahaha","dddd");
		return dto;
	}

	



}

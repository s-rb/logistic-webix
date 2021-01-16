define(['component/listPage'], function (listPage) {
  return listPage(
      'markList',
      'resource->/api/mark',
      [
        {id: 'id'},
        {id: 'name', editor: 'text'},
      ]);
});
<?php
// Routes

$app->get('/campeao/list', function ($request, $response) {

	$db = $this->db;
	foreach($db->query('SELECT * FROM campeoes') as $row){
		$return[] = $row;
	};

	return $response->withJson($return);
});

$app->get('/skins/list', function ($request, $response) {

	$db = $this->db;

	foreach($db->query('SELECT * FROM skins ORDER BY skins_id') as $row){
		$return[] = $row;
	};

	return $response->withJson($return);
});
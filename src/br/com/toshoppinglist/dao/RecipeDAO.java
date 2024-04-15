package br.com.toshoppinglist.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.toshoppinglist.model.Recipe;

@Repository
public class RecipeDAO {
	
//	private Connection connection;
	
//	@Autowired
//	public RecipeDAO(DataSource mySqlDataSource) {
//		try {
//			this.connection = mySqlDataSource.getConnection();
//		} catch (SQLException exception) {
//			exception.printStackTrace();
//		}
//	}

//	public List<Recipe> buscarTodasReceitas() {
//		List<Recipe> receitasList = new ArrayList<Recipe>();
//		try {
//			String query = "SELECT * FROM recipe_to_shopping_list_db.RECEITAS";
//			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			
//			while(resultSet.next()) {
//				receitasList.add(getRecipeFromResultSet(resultSet));
//			}
//			resultSet.close();
//			preparedStatement.close();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} 
//		
//		return receitasList;
//	}

	public List<Recipe> buscarTodasReceitas() {
		List<Recipe> receitasList = new ArrayList<Recipe>();
		Recipe receitaMock1 = new Recipe();
		Recipe receitaMock2 = new Recipe();
		Recipe receitaMock3 = new Recipe();
		
		receitaMock1.setIdReceita(1);
		receitaMock1.setNomeReceita("Pao de Forma");
		receitaMock1.setModoPreparoReceita("Descricao do modo de preparo do Pao de Forma.");
		receitasList.add(receitaMock1);
		
		receitaMock2.setIdReceita(2);
		receitaMock2.setNomeReceita("Pizza");
		receitaMock2.setModoPreparoReceita("Modo de preparo da Pizza...");
		receitasList.add(receitaMock2);
		
		receitaMock3.setIdReceita(3);
		receitaMock3.setNomeReceita("Feijoada");
		receitaMock3.setModoPreparoReceita("Como se faz uma feijoada: ");
		receitasList.add(receitaMock3);
		
		return receitasList;
	}

//	private Recipe getRecipeFromResultSet(ResultSet resultSet) {
//		Recipe recipe = new Recipe();
//		
//		try {
//			recipe.setId_receita(resultSet.getInt("id_receita"));
//			recipe.setNome_receita(resultSet.getString("nome_receita"));
//			recipe.setModo_preparo_receita(resultSet.getString("modo_preparo_receita"));
//			
//			Date data_receita_date = resultSet.getDate("data_receita");
//			
//			if(data_receita_date != null) {
//				Calendar data_receita_calendar = Calendar.getInstance();
//				data_receita_calendar.setTime(data_receita_date);
//				recipe.setData_receita(data_receita_calendar);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return recipe;
//	}
	
}
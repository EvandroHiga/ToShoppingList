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

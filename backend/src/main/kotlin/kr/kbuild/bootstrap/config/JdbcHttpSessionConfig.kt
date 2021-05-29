import javax.sql.DataSource

import org.springframework.context.annotation.Bean
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession
import org.springframework.transaction.PlatformTransactionManager

@EnableJdbcHttpSession
class JdbcHttpSessionConfig {
    @Bean
    fun transactionManager(dataSource: DataSource) = DataSourceTransactionManager(dataSource)
}
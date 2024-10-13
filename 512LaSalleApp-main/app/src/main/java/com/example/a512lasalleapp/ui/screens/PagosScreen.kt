package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.R

data class PaymentStatus(val month: String, val isPaid: Boolean)

@Composable
fun PagosScreen(innerPadding: PaddingValues) {
    val paymentStatuses = listOf(
        PaymentStatus("January", true),
        PaymentStatus("February", true),
        PaymentStatus("March", false),
        PaymentStatus("April", true),
        PaymentStatus("May", false),
        PaymentStatus("June", true)
    )

    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Payment Status", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(paymentStatuses) { payment ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = payment.month, style = MaterialTheme.typography.bodyLarge)
                    if (payment.isPaid) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_check),
                            contentDescription = "Paid",
                            tint = Color.Green,
                            modifier = Modifier.size(24.dp)
                        )
                    } else {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_alert),
                            contentDescription = "Pending",
                            tint = Color.Red,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
        }
    }
}



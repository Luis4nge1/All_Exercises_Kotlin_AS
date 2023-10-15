package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceImages()
                }
            }
        }
    }
}


@Composable
fun ArtSpaceImages(modifier: Modifier = Modifier) {

    val primeraImg= R.drawable.beatles
    val segundaImg= R.drawable.guns_roses
    val terceraImg= R.drawable.jackson_michael
    val cuartaImg= R.drawable.queen
    var quintaImg= R.drawable.modern_talking
    var sextaImg= R.drawable.pink_floyd

    var title by remember {
        mutableStateOf(R.string.beatles)
    }

    var autor by remember {
        mutableStateOf(R.string.beatles_nationality)
    }

    var year by remember {
        mutableStateOf(R.string.beatles_year)
    }

    var currentArtwork by remember {
        mutableStateOf(primeraImg)
    }

    var imageResource by remember {
        mutableStateOf(currentArtwork)
    }


    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ArtworkDisplay(currentArtwork = currentArtwork)
        Spacer(modifier = modifier.size(16.dp))
        Titulo(title = title, autor = autor, year = year)
        Spacer(modifier = modifier.size(25.dp))
        Row(
            modifier = modifier.padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            //horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Spacer izquierdo para centrar el botón "Anterior"
            Spacer(modifier = modifier.weight(0.0001f))
            Button(
                onClick = {
                    when (currentArtwork) {
                        primeraImg -> {
                            currentArtwork = sextaImg
                            title = R.string.pinkFloyd
                            autor = R.string.pinkFloyd_nationality
                            year = R.string.pinkFloyd_year
                        }
                        segundaImg -> {
                            currentArtwork = primeraImg
                            title = R.string.beatles
                            autor = R.string.beatles_nationality
                            year = R.string.beatles_year
                        }
                        terceraImg -> {
                            currentArtwork = segundaImg
                            title = R.string.gunsroses
                            autor = R.string.gunsroses_nationalityr
                            year = R.string.gunsroses_year
                        }
                        cuartaImg -> {
                            currentArtwork = terceraImg
                            title = R.string.michaelJackson
                            autor = R.string.michaelJackson_nationality
                            year = R.string.michaelJackson_year
                        }
                        quintaImg -> {
                            currentArtwork = cuartaImg
                            title = R.string.queen
                            autor = R.string.queen_nationality
                            year = R.string.queen_year
                        }
                        else -> {
                            currentArtwork = quintaImg
                            title = R.string.modernTalking
                            autor = R.string.modernTalking_nationality
                            year = R.string.modernTalking_year
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.purple_700)/*previous*/
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp
                )
            ) {
                Text(
                    text = "Anterior",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.white) /*previous*/
                )
            }

            // Spacer derecho para centrar el botón "Siguiente"
            Spacer(modifier = modifier.weight(0.1f))

            Button(
                onClick = {
                    when (currentArtwork) {
                        primeraImg -> {
                            currentArtwork = segundaImg
                            title = R.string.gunsroses
                            autor = R.string.gunsroses_nationalityr
                            year = R.string.gunsroses_year
                        }
                        segundaImg -> {
                            currentArtwork = terceraImg
                            title = R.string.michaelJackson
                            autor = R.string.michaelJackson_nationality
                            year = R.string.michaelJackson_year
                        }
                        terceraImg -> {
                            currentArtwork = cuartaImg
                            title = R.string.queen
                            autor = R.string.queen_nationality
                            year = R.string.queen_year
                        }
                        cuartaImg -> {
                            currentArtwork = quintaImg
                            title = R.string.modernTalking
                            autor = R.string.modernTalking_nationality
                            year = R.string.modernTalking_year
                        }
                        quintaImg -> {
                            currentArtwork = sextaImg
                            title = R.string.pinkFloyd
                            autor = R.string.pinkFloyd_nationality
                            year = R.string.pinkFloyd_year
                        }
                        else -> {
                            currentArtwork = primeraImg
                            title = R.string.beatles
                            autor = R.string.beatles_nationality
                            year = R.string.beatles_year
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.purple_700)/*Next*/
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp
                )
            ) {
                Text(
                    text = "Siguiente",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.white)/*Next*/
                )
            }
        }
    }
}

@Composable
fun ArtworkDisplay(
    modifier: Modifier = Modifier,
    @DrawableRes currentArtwork: Int
) {
    Image(
        painter = painterResource(currentArtwork),
        contentDescription = stringResource(id = R.string.beatles),
        modifier = modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun Titulo(
    @StringRes title: Int,
    @StringRes autor: Int,
    @StringRes year: Int
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Titulo
        Text(
            text = stringResource(id = title),
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.white),
            fontSize = 32.sp
        )

        // Autor
        Text(
            text = "Nacionalidad: ${stringResource(id = autor)}",
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.white),
            fontSize = 16.sp
        )

        // Anio
        Text(
            text = "Anio de comienzo: ${stringResource(id = year)}",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = colorResource(id = R.color.purple_200)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpaceImages()
    }
}
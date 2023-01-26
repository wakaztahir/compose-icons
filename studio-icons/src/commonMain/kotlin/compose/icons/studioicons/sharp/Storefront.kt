package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9f, 8.89f)
                lineTo(20.49f, 3.0f)
                horizontalLineToRelative(-3.75f)
                horizontalLineToRelative(-2.01f)
                horizontalLineTo(13.0f)
                horizontalLineToRelative(-2.0f)
                horizontalLineTo(9.28f)
                horizontalLineTo(7.26f)
                horizontalLineTo(3.51f)
                lineTo(2.1f, 8.89f)
                curveToRelative(-0.24f, 1.02f, -0.02f, 2.06f, 0.62f, 2.88f)
                curveTo(2.8f, 11.88f, 2.91f, 11.96f, 3.0f, 12.06f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-8.94f)
                curveToRelative(0.09f, -0.09f, 0.2f, -0.18f, 0.28f, -0.28f)
                curveTo(21.92f, 10.96f, 22.15f, 9.91f, 21.9f, 8.89f)
                close()
                moveTo(7.02f, 5.0f)
                lineTo(6.44f, 9.86f)
                curveTo(6.36f, 10.51f, 5.84f, 11.0f, 5.23f, 11.0f)
                curveToRelative(-0.49f, 0.0f, -0.8f, -0.29f, -0.93f, -0.47f)
                curveToRelative(-0.26f, -0.33f, -0.35f, -0.76f, -0.25f, -1.17f)
                lineTo(5.09f, 5.0f)
                horizontalLineTo(7.02f)
                close()
                moveTo(18.91f, 5.0f)
                lineToRelative(1.05f, 4.36f)
                curveToRelative(0.1f, 0.42f, 0.01f, 0.84f, -0.25f, 1.17f)
                curveTo(19.57f, 10.71f, 19.27f, 11.0f, 18.77f, 11.0f)
                curveToRelative(-0.61f, 0.0f, -1.14f, -0.49f, -1.21f, -1.14f)
                lineTo(16.98f, 5.0f)
                horizontalLineTo(18.91f)
                close()
                moveTo(15.51f, 9.52f)
                curveToRelative(0.05f, 0.39f, -0.07f, 0.78f, -0.33f, 1.07f)
                curveTo(14.95f, 10.85f, 14.63f, 11.0f, 14.22f, 11.0f)
                curveTo(13.55f, 11.0f, 13.0f, 10.41f, 13.0f, 9.69f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.96f)
                lineTo(15.51f, 9.52f)
                close()
                moveTo(11.0f, 9.69f)
                curveTo(11.0f, 10.41f, 10.45f, 11.0f, 9.71f, 11.0f)
                curveToRelative(-0.34f, 0.0f, -0.65f, -0.15f, -0.89f, -0.41f)
                curveTo(8.57f, 10.3f, 8.45f, 9.91f, 8.49f, 9.52f)
                lineTo(9.04f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.69f)
                close()
                moveTo(5.0f, 19.0f)
                verticalLineToRelative(-6.03f)
                curveTo(5.08f, 12.98f, 5.15f, 13.0f, 5.23f, 13.0f)
                curveToRelative(0.87f, 0.0f, 1.66f, -0.36f, 2.24f, -0.95f)
                curveToRelative(0.6f, 0.6f, 1.4f, 0.95f, 2.31f, 0.95f)
                curveToRelative(0.87f, 0.0f, 1.65f, -0.36f, 2.23f, -0.93f)
                curveToRelative(0.59f, 0.57f, 1.39f, 0.93f, 2.29f, 0.93f)
                curveToRelative(0.84f, 0.0f, 1.64f, -0.35f, 2.24f, -0.95f)
                curveToRelative(0.58f, 0.59f, 1.37f, 0.95f, 2.24f, 0.95f)
                curveToRelative(0.08f, 0.0f, 0.15f, -0.02f, 0.23f, -0.03f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null

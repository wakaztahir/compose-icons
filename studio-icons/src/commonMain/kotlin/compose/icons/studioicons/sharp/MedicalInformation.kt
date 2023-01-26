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

public val SharpGroup.MedicalInformation: ImageVector
    get() {
        if (_medicalInformation != null) {
            return _medicalInformation!!
        }
        _medicalInformation = Builder(name = "MedicalInformation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(13.0f, 14.5f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.0f, 17.5f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _medicalInformation!!
    }

private var _medicalInformation: ImageVector? = null